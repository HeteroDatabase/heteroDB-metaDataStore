package com.heteroDB.metaDataStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heteroDB.metaDataStore.enums.DBMSTypeEnum;
import com.heteroDB.metaDataStore.model.QueryData;
import com.heteroDB.metaDataStore.service.MySQLExecutorService;
import com.heteroDB.metaDataStore.service.QueryScriptService;

@Service
public class QueryScriptServiceImpl implements QueryScriptService {

	@Autowired
	MySQLExecutorService mySQLExecutorService;
	
	/* (non-Javadoc)
	 * @see com.heteroDB.metaDataStore.service.QueryScriptService#executeQueryScript(java.lang.Long, com.heteroDB.metaDataStore.model.QueryData)
	 */
	@Override
	public Boolean processQueryScript(Long userId, QueryData queryData) {
		
		if(queryData!=null) {
			
			//if the database type is mysql then use MySQL service 
			if(queryData.getDatabaseType().equals(DBMSTypeEnum.MYSQL)) {
				return mySQLExecutorService.processQueryScript(userId, queryData.getQueryScript());
			}
		}
		return false;
		
	}

}
