package com.heteroDB.metaDataStore.service;

public interface MySQLExecutorService {

	/**
	 * processes the query script on mysql database
	 * Also, stores the relevant meta data for user
	 * @param userId
	 * @param queryScript
	 * @return true if executed successfully otherwise false
	 */
	Boolean processQueryScript(Long userId,String queryScript);
}
