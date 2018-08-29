package com.heteroDB.metaDataStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heteroDB.metaDataStore.command.DatabaseExecutorCommand;
import com.heteroDB.metaDataStore.model.QueryData;
import com.heteroDB.metaDataStore.service.QueryScriptService;
import com.heteroDB.metaDataStore.utility.DatabaseExecutorServiceMap;

@Service
public class QueryScriptServiceImpl implements QueryScriptService {

	@Autowired
	DatabaseExecutorServiceMap databaseExecutorServiceMap;
	
	/* (non-Javadoc)
	 * @see com.heteroDB.metaDataStore.service.QueryScriptService#executeQueryScript(java.lang.Long, com.heteroDB.metaDataStore.model.QueryData)
	 */
	@Override
	public Boolean processQueryScript(Long userId, QueryData queryData) {
		
		if(queryData!=null && queryData.getDatabaseType()!=null) {
			DatabaseExecutorCommand databaseExecutorCommand = databaseExecutorServiceMap.getExecutorCommand(queryData.getDatabaseType().getDatabaseType().toLowerCase());
			return databaseExecutorCommand.processQueryScript(userId, queryData.getQueryScript());
		}
		return false;
		
	}

}
