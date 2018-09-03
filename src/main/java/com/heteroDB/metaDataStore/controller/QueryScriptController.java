package com.heteroDB.metaDataStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heteroDB.metaDataStore.httpClient.MySQLHttpClient;
import com.heteroDB.metaDataStore.model.QueryData;
import com.heteroDB.metaDataStore.model.ScriptExecutionResponse;
import com.heteroDB.metaDataStore.service.QueryScriptService;

@RestController
@RequestMapping(value="/script")
public class QueryScriptController {
	
	@Autowired
	QueryScriptService queryScriptService;
	
	@Autowired
	MySQLHttpClient mysqlServiceClient;
	
	@RequestMapping(value = "/execute", method = RequestMethod.POST)
	public ResponseEntity<ScriptExecutionResponse> executeScript(@RequestParam("userId") Long userId, 
			@RequestBody QueryData queryData) {
		ScriptExecutionResponse scriptExecutionResponse = queryScriptService.processQueryScript(userId, queryData);
		return new ResponseEntity<>(scriptExecutionResponse,HttpStatus.OK);
	}

}
