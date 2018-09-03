package com.heteroDB.metaDataStore.model;

public class ExecutionStatus {
	
	private String statusCode;
	private String statusText;
	
	public ExecutionStatus() {
		super();
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

}
