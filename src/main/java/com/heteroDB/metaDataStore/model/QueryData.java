package com.heteroDB.metaDataStore.model;

public class QueryData {
	
	private String script;
	private String databaseType;
	
	
	
	
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public String getDatabaseType() {
		return databaseType;
	}
	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
	
	
	@Override
	public String toString() {
		return "QueryData [script=" + script + ", databaseType=" + databaseType + "]";
	}
	
	
	
	

}
