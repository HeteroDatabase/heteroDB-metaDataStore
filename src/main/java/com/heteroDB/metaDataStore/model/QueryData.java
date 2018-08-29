package com.heteroDB.metaDataStore.model;

import com.heteroDB.metaDataStore.enums.DBMSTypeEnum;

public class QueryData {
	
	/*
	 * The query script
	 */
	private String queryScript;
	
	/*
	 * The database type
	 * For eg : `mysql` , `oracle` etc
	 */
	private DBMSTypeEnum databaseType;

	public QueryData() {
		super();
	}

	public QueryData(String queryScript, DBMSTypeEnum databaseType) {
		super();
		this.queryScript = queryScript;
		this.databaseType = databaseType;
	}

	public String getQueryScript() {
		return queryScript;
	}

	public void setQueryScript(String queryScript) {
		this.queryScript = queryScript;
	}

	public DBMSTypeEnum getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(DBMSTypeEnum databaseType) {
		this.databaseType = databaseType;
	}

	@Override
	public String toString() {
		return "QueryData [queryScript=" + queryScript + ", databaseType=" + databaseType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((databaseType == null) ? 0 : databaseType.hashCode());
		result = prime * result + ((queryScript == null) ? 0 : queryScript.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryData other = (QueryData) obj;
		if (databaseType != other.databaseType)
			return false;
		if (queryScript == null) {
			if (other.queryScript != null)
				return false;
		} else if (!queryScript.equals(other.queryScript))
			return false;
		return true;
	}	

}
