package com.heteroDB.metaDataStore.command;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.heteroDB.metaDataStore.httpClient.MySQLHttpClient;
import com.heteroDB.metaDataStore.model.ScriptExecutionResponse;
import com.heteroDB.metaDataStore.parser.QueryScriptParser;

@Component("mySQLExecutorCommandImpl")
public class MySQLExecutorCommandImpl implements DatabaseExecutorCommand {

	@Autowired
	MySQLHttpClient mySQLHttpClient;
	
	@Autowired
	@Qualifier("mySQLQueryScriptParser")
	QueryScriptParser mySQLQueryScriptParser;
	
	@Override
	public ScriptExecutionResponse processQueryScript(Long userId, String queryScript) {
		
		//parses the query script
		//breaks it into single queries
		//checks syntactical error
		List<String> queriesList = mySQLQueryScriptParser.parseScript(queryScript);
		
		for(String query : queriesList) {
			
			mySQLHttpClient.executeMysqlQuery(query);
		}
		return null;
	}

}
