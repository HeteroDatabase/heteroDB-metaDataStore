package com.heteroDB.metaDataStore.utility;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.heteroDB.metaDataStore.command.DatabaseExecutorCommand;
import com.heteroDB.metaDataStore.enums.DBMSTypeEnum;

@Component
public class DatabaseExecutorServiceMap {
	
	@Autowired
	@Qualifier("mySQLExecutorCommandImpl")
	private DatabaseExecutorCommand mySQLExecutorCommand;
	
	private Map<String,DatabaseExecutorCommand> executorCommandMap = new HashMap<>();
	
	@PostConstruct
	public void fillMap() {
		executorCommandMap.put(DBMSTypeEnum.MYSQL.getDatabaseType(), mySQLExecutorCommand);
	}
	
	public DatabaseExecutorCommand getExecutorCommand(String databaseType) {
		if(executorCommandMap.containsKey(databaseType)) {
			return executorCommandMap.get(databaseType);
		}
		return null;
	}
}
