package com.heteroDB.metaDataStore.parser;

public class MySQLQueryScriptParser extends QueryScriptParser {

	@Override
	public Boolean parseAndVerifyEachQuery(String query) {
		return true;
	}

}
