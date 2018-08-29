package com.heteroDB.metaDataStore.parser;

import org.springframework.stereotype.Component;

@Component("mySQLQueryScriptParser")
public class MySQLQueryScriptParser extends QueryScriptParser {

	@Override
	public Boolean parseAndVerifyQuery(String query) {
		return true;
	}

}
