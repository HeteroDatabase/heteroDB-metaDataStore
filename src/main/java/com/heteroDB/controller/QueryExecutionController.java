package com.heteroDB.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heteroDB.model.QueryData;

@RestController
public class QueryExecutionController {
	
	@RequestMapping(value = "/executeQuery", method = RequestMethod.POST)
	public void ExecuteQuery(@RequestBody QueryData queryData) {
		System.out.println(queryData);
		
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public void test() {
		System.out.println("testing");
		
	}

}
