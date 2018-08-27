package com.heteroDB.metaDataStore.model;

import com.heteroDB.metaDataStore.enums.DatabaseServers;

public class QueryData {
	
	private String script;
	private DatabaseServers databaseType;
	
	
	
	
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	
	
	public DatabaseServers getDatabaseType() {
		return databaseType;
	}
	public void setDatabaseType(DatabaseServers databaseType) {
		this.databaseType = databaseType;
	}
	@Override
	public String toString() {
		return "QueryData [script=" + script + ", databaseType=" + databaseType + "]";
	}
	
	
	
	

}
