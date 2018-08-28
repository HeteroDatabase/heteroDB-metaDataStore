package com.heteroDB.metaDataStore.enums;

public enum DBMSTypeEnum {
	
	MYSQL("mysql");

	private final String databaseType;
	
	private DBMSTypeEnum(String databaseType) {
		this.databaseType = databaseType;
	}
	
	public String getDatabaseType() {
		return this.databaseType;
	}
}
