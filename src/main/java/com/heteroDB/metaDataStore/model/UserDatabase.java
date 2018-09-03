package com.heteroDB.metaDataStore.model;

import java.util.Set;

public class UserDatabase {

	/**
	 * Id of the database in the external data source
	 */
	private Long databaseId;
	
	/**
	 * DBMS that this database is created on
	 */
	private DBMSType dbmsType;
	
	/**
	 * Name of the database 
	 */
	private String databaseName;
	
	/**
	 * Tables in the database
	 */
	private Set<UserTable> userTables;

	public UserDatabase() {
		super();
	}

	public Long getDatabaseId() {
		return databaseId;
	}

	public void setDatabaseId(Long databaseId) {
		this.databaseId = databaseId;
	}

	public DBMSType getDbmsType() {
		return dbmsType;
	}

	public void setDbmsType(DBMSType dbmsType) {
		this.dbmsType = dbmsType;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public Set<UserTable> getUserTables() {
		return userTables;
	}

	public void setUserTables(Set<UserTable> userTables) {
		this.userTables = userTables;
	}
	
}
