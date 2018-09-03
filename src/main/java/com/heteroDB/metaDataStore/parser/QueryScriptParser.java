package com.heteroDB.metaDataStore.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class QueryScriptParser {

	public List<String> parseScript(String queryScript) {
		
		//Assumption:
		//The presence of ';' shows the presence of multiple queries in the script 
		if(queryScript.indexOf(';')!=-1) {
			String[] queries=queryScript.split(";");
			for(int i=0;i<queries.length;i++) {
				parseAndVerifyQuery(queries[i]);
			}
			return Arrays.asList(queries);
		}
		
		//parse the whole script as single query
		List<String> parsedQueries = new ArrayList<>();
		parsedQueries.add(queryScript);
		parseAndVerifyQuery(queryScript);
		return parsedQueries;
	}
	
	public abstract Boolean parseAndVerifyQuery(String query);
}
