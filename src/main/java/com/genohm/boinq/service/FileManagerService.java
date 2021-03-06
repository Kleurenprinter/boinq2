package com.genohm.boinq.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FilenameUtils;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.genohm.boinq.domain.RawDataFile;

@Service
public class FileManagerService implements EnvironmentAware {

	
	private static final String FILEMANAGER_PREFIX = "boinq.filemanager.";
	private static final String BASEPATH_KEY = "basepath";
	private static final String BASEPATH_DEFAULT = "files";
	
	private RelaxedPropertyResolver propertyResolver;
	private String basePath;
	
	@PostConstruct
	private void init() {
		this.basePath = propertyResolver.getProperty(BASEPATH_KEY, BASEPATH_DEFAULT);
	}
	
	@Override
	public void setEnvironment(Environment environment) {
		this.propertyResolver = new RelaxedPropertyResolver(environment,FILEMANAGER_PREFIX);
	}
	
	public RawDataFile putFile(MultipartFile inputFile) throws IOException {
		String fileName = FilenameUtils.getName(inputFile.getOriginalFilename());
		InputStream input = inputFile.getInputStream();
		return putFile(input, fileName);
	}
	
	public RawDataFile putFile(File inputFile) throws IOException {
	   	String fileName = FilenameUtils.getBaseName(inputFile.getName());
        InputStream input = new FileInputStream(inputFile);
        return putFile(input, fileName);
 	}
	
	public RawDataFile putFile(InputStream input, String fileName) throws IOException {
       	String uuidString = UUID.randomUUID().toString();
        String targetPath = FilenameUtils.concat(uuidString.substring(0, 3), uuidString.substring(3));
        targetPath = FilenameUtils.concat(targetPath, fileName);
        String fullPath = FilenameUtils.concat(basePath, targetPath);
        File targetFile = new File(fullPath);
        targetFile.getParentFile().mkdirs();
        targetFile.createNewFile();
        FileOutputStream out = new FileOutputStream(targetFile);
        byte[] buffer = new byte[4096];  
        int bytesRead;  
        while ((bytesRead = input.read(buffer)) != -1) {  
          out.write(buffer, 0, bytesRead);  
        }  
        input.close();  
        out.close();  
        return new RawDataFile(fullPath);
	}
	
	public File getFile(RawDataFile rawDataFile) {
		return new File(rawDataFile.getFilePath());
	}

	public void remove(RawDataFile toRemove) {
		File theFile = new File(toRemove.getFilePath());
		theFile.delete();
	}

}
