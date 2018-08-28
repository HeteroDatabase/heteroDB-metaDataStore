package com.heteroDB.metaDataStore.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("mysql-server")
public interface MySQLHttpClient {
	
	@RequestMapping(value= "/executeMysql",method = RequestMethod.POST,consumes = "application/json")
	Boolean executeMysqlQuery(String query);

}
