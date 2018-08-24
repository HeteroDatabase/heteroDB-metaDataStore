package com.heteroDB.metaDataStore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heteroDB.metaDataStore.model.QueryData;

@RestController
public class QueryExecutionController {
	
	@RequestMapping(value = "/executeQuery", method = RequestMethod.POST)
	public ResponseEntity<Void> ExecuteQuery(@RequestBody QueryData queryData) {
		System.out.println(queryData);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public void test() {
		System.out.println("testing");
		
	}

}