package com.heteroDB.metaDataStore.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class QueryScriptParser {

	public List<String> parseScript(String queryScript) {
		if(queryScript.indexOf(';')!=-1) {
			String[] queries=queryScript.split(";");
			for(int i=0;i<queries.length;i++) {
				parseAndVerifyQuery(queries[i]);
			}
			return Arrays.asList(queries);
		}
		List<String> parsedQueries = new ArrayList<>();
		parsedQueries.add(queryScript);
		return parsedQueries;
	}
	
	public abstract Boolean parseAndVerifyQuery(String query);
}
