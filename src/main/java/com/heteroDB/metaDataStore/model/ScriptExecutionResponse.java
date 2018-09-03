package com.heteroDB.metaDataStore.model;

public class ScriptExecutionResponse {

	/*
	 * stores the execution status of whole script
	 */
	private ExecutionStatus globalExecutionStatus;

	public ScriptExecutionResponse() {
		super();
	}

	public ScriptExecutionResponse(ExecutionStatus globalExecutionStatus) {
		super();
		this.globalExecutionStatus = globalExecutionStatus;
	}

	public ExecutionStatus getGlobalExecutionStatus() {
		return globalExecutionStatus;
	}

	public void setGlobalExecutionStatus(ExecutionStatus globalExecutionStatus) {
		this.globalExecutionStatus = globalExecutionStatus;
	}
	
}
