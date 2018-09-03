package com.heteroDB.metaDataStore.model;

public class DBMSType {
	
	/** 
	 * Id of the DBMS in the external data source
	 */
	private Long id;
	
	/**
	 * Name of DBMS in the external data source
	 */
	private String name;
	
	public DBMSType() {
		super();
	}
	
	public DBMSType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
