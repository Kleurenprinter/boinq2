package com.genohm.boinq.service;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.genohm.boinq.Application;
import com.genohm.boinq.init.TripleStoreInitializer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@DirtiesContext(classMode= DirtiesContext.ClassMode.AFTER_CLASS)
@ActiveProfiles("test")
public class QueryBuilderServiceTest {
	@Inject
	QueryBuilderService queryBuilderService;
	
	@Inject
	TripleStoreInitializer tsInitializer;
	
	@Before
	public void init() {
		tsInitializer.checkInit();
	}
	
	@Test
	public void brol() {
		String qry = queryBuilderService.getFilteredTree("gene");
		System.out.print(qry);
	}

}
