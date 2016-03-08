package com.genohm.boinq.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.genohm.boinq.domain.SPARQLResultSet;
import com.genohm.boinq.domain.Track;
import com.genohm.boinq.repository.TrackRepository;

@Service
public class MetaInfoService {
	
	//TODO: merge with metadatagraphservice into metadataservice

	private static Logger log = LoggerFactory.getLogger(MetaInfoService.class);
	
	@Inject
	private QueryBuilderService queryBuilderService;
	@Inject
	private SPARQLClientService sparqlClientService;
	
	public void getLocalToBoinqReferenceMap(Track track) {
		try {
			String query = queryBuilderService.findReferenceMap(track);
			SPARQLResultSet result = sparqlClientService.querySelect(track.getDatasource().getMetaEndpointUrl(), track.getDatasource().getMetaGraphName(), query);
			Map<Node, Node> results = new HashMap<>();
			for (Map<String,String> record: result.getRecords()) {
				results.put(NodeFactory.createURI(record.get(QueryBuilderService.ORIGINAL_REFERENCE)), NodeFactory.createURI(QueryBuilderService.TARGET_REFERENCE));
			}
			track.setReferenceMap(results);
		} catch (Exception e) {
			log.error("Couldn't get reference map for track " + track.getGraphName(),e);
			track.setReferenceMap(null);
		}
		
	}
	
	public void getSupportedOperators(Track track) {
		try {
			String query = queryBuilderService.getOperators(track);
			SPARQLResultSet result = sparqlClientService.querySelect(track.getDatasource().getMetaEndpointUrl(), track.getDatasource().getMetaGraphName(), query);
			Map<String,Map<String,String>> operators = new HashMap<>();
			for (Map<String,String> record: result.getRecords()) {
				operators.put(record.get(QueryBuilderService.OPERATOR_NAME), record);
			}
			track.setSupportedOperators(operators);
		} catch (Exception e) {
			log.error("Could not find supported operators for track " + track.getGraphName(), e);
			track.setSupportedOperators(null);
		}
	}
	
	public long getFeatureCount(Track track) {
	long featureCount=0;
		try {
			String query = queryBuilderService.findFeatureCount(track.getGraphName());
			SPARQLResultSet result = sparqlClientService.querySelect(track.getDatasource().getMetaEndpointUrl(),track.getDatasource().getMetaGraphName(), query);
			for (Map<String,String> record: result.getRecords()) {
				featureCount += Integer.parseInt(record.get(QueryBuilderService.VARIABLE_FEATURE_COUNT));
			}
			
		} catch (Exception e) {
			log.error("Could not find supported featurecount for track " + track.getGraphName(), e);
			track.setFeatureCount(0);
		}
		return featureCount;
	}
	
	public long getTripleCount(Track track) {
		long tripleCount=0;
			try {
				String query = queryBuilderService.findTripleCount(track.getGraphName());
				SPARQLResultSet result = sparqlClientService.querySelect(track.getDatasource().getMetaEndpointUrl(),track.getDatasource().getMetaGraphName(), query);
				for (Map<String,String> record: result.getRecords()) {
					tripleCount += Integer.parseInt(record.get(QueryBuilderService.VARIABLE_TRIPLE_COUNT));
				}
				
			} catch (Exception e) {
				log.error("Could not find supported featurecount for track " + track.getGraphName(), e);
				track.setFeatureCount(0);
			}
			return tripleCount;
		}
	
	public void getSupportedFeatureTypes(Track track) {
		try {
			String query = queryBuilderService.findFeatureTypes(track.getGraphName());
			SPARQLResultSet result = sparqlClientService.querySelect(track.getDatasource().getMetaEndpointUrl(), track.getDatasource().getMetaGraphName(), query);
			Map<String, String> results = new HashMap<>();
			for (Map<String,String> record: result.getRecords()) {
				results.put(record.get(QueryBuilderService.VARIABLE_FEATURE_TYPE_LABEL), record.get(QueryBuilderService.VARIABLE_FEATURE_TYPE));
			}
			track.setSupportedFeatureTypes(results);
		} catch (Exception e) {
			log.error("Could not find supported operators for track " + track.getGraphName(), e);
			track.setSupportedOperators(null);
			
		}
	}
	
	public void addMetaInfo(Track track) {
		getLocalToBoinqReferenceMap(track);
		getSupportedOperators(track);
		getSupportedFeatureTypes(track);
	}

	
}
