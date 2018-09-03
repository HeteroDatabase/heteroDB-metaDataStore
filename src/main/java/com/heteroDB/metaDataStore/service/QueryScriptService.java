package com.heteroDB.metaDataStore.service;

import com.heteroDB.metaDataStore.model.QueryData;
import com.heteroDB.metaDataStore.model.ScriptExecutionResponse;

public interface QueryScriptService {
	
	/**
	 * Processes the query script and stores the meta data for user
	 * @param userId
	 * @param queryData
	 * 
	 * @return response object 
	 */
	public ScriptExecutionResponse processQueryScript(Long userId , QueryData queryData);

}
