package com.heteroDB.metaDataStore.command;

import com.heteroDB.metaDataStore.model.ScriptExecutionResponse;

public interface DatabaseExecutorCommand {

	/**
	 * processes the query script on database
	 * Also, stores the relevant meta data for user
	 * @param userId
	 * @param queryScript
	 * @return response object
	 */
	public ScriptExecutionResponse processQueryScript(Long userId,String queryScript);
}
