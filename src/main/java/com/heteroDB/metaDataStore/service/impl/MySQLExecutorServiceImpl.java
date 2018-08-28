package com.heteroDB.metaDataStore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heteroDB.metaDataStore.httpClient.MySQLHttpClient;
import com.heteroDB.metaDataStore.parser.QueryScriptParser;
import com.heteroDB.metaDataStore.service.MySQLExecutorService;

@Service
public class MySQLExecutorServiceImpl implements MySQLExecutorService {

	@Autowired
	MySQLHttpClient mySQLHttpClient;
	
	@Autowired
	QueryScriptParser mySQLQueryScriptParser;
	
	@Override
	public Boolean processQueryScript(Long userId, String queryScript) {
		List<String> queriesList = mySQLQueryScriptParser.parseScript(queryScript);
		
		for(String query : queriesList) {
			mySQLHttpClient.executeMysqlQuery(query);
		}
		return true;
	}

}
