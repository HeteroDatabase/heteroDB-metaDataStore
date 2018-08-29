package com.heteroDB.metaDataStore.service;

import com.heteroDB.metaDataStore.model.QueryData;

public interface QueryScriptService {
	
	/**
	 * Processes the query script and stores the meta data for user
	 * @param userId
	 * @param queryData
	 * 
	 * @return true if executed successfully otherwise false
	 */
	public Boolean processQueryScript(Long userId , QueryData queryData);

}
