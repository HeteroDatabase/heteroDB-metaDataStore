package com.heteroDB.metaDataStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heteroDB.metaDataStore.command.DatabaseExecutorCommand;
import com.heteroDB.metaDataStore.enums.QueryExecutionStatusEnum;
import com.heteroDB.metaDataStore.model.ExecutionStatus;
import com.heteroDB.metaDataStore.model.QueryData;
import com.heteroDB.metaDataStore.model.ScriptExecutionResponse;
import com.heteroDB.metaDataStore.service.QueryScriptService;
import com.heteroDB.metaDataStore.utility.Constants;
import com.heteroDB.metaDataStore.utility.DatabaseExecutorServiceMap;

@Service
public class QueryScriptServiceImpl implements QueryScriptService {

	@Autowired
	DatabaseExecutorServiceMap databaseExecutorServiceMap;
	
	/* (non-Javadoc)
	 * @see com.heteroDB.metaDataStore.service.QueryScriptService#executeQueryScript(java.lang.Long, com.heteroDB.metaDataStore.model.QueryData)
	 */
	@Override
	public ScriptExecutionResponse processQueryScript(Long userId, QueryData queryData) {
		
		if(queryData!=null && queryData.getDatabaseType()!=null) {
			
			//fetching database executor command object specific to received database type
			// each database executor command object exposes one method `processQueryScript`
			DatabaseExecutorCommand databaseExecutorCommand = databaseExecutorServiceMap.getExecutorCommand(queryData.getDatabaseType().getDatabaseType().toLowerCase());
			ScriptExecutionResponse scriptResponse = databaseExecutorCommand.processQueryScript(userId, queryData.getQueryScript());
			if(scriptResponse==null) {
				
				//if response is null then the reason is unknown at this stage
				//hence sending fatal error status
				ExecutionStatus executionStatus = new ExecutionStatus();
				executionStatus.setStatusCode(QueryExecutionStatusEnum.FATAL_ERROR.getQueryExecutionStatus());
				executionStatus.setStatusText(Constants.EXECUTION_STATUS_TEXT_UNKNOWN_REASON);
				
				scriptResponse = new ScriptExecutionResponse(executionStatus);
			}
			return scriptResponse;
		}
		
		ExecutionStatus executionStatus = new ExecutionStatus();
		executionStatus.setStatusCode(QueryExecutionStatusEnum.FATAL_ERROR.getQueryExecutionStatus());
		executionStatus.setStatusText(Constants.EXECUTION_STATUS_TEXT_NO_DATABASE);
		
		ScriptExecutionResponse errorResponse = new ScriptExecutionResponse(executionStatus);
		return errorResponse;
	}

}
