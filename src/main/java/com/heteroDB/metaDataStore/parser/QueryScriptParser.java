package com.heteroDB.metaDataStore.parser;

import java.util.Arrays;
import java.util.List;

public abstract class QueryScriptParser {

	public List<String> parseScript(String queryScript) {
		String[] queries=queryScript.split(";");
		for(int i=0;i<queries.length;i++) {
			parseAndVerifyEachQuery(queries[i]);
		}
		return Arrays.asList(queries);
	}
	
	public abstract Boolean parseAndVerifyEachQuery(String query);
}
