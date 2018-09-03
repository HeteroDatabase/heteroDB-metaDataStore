package com.heteroDB.metaDataStore.enums;

public enum QueryExecutionStatusEnum {
	
	FATAL_ERROR("fatal_error"),
	SUCCESS("success");
	
	private final String executionStatus;
	
	private QueryExecutionStatusEnum(String executionStatus) {
		this.executionStatus = executionStatus;
	}
	
	public String getQueryExecutionStatus() {
		return this.executionStatus;
	}
}
