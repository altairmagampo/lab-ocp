package com.magallanes.altair.lab.ocp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magallanes.altair.lab.ocp.model.TestModel;

@RestController("/")
public class TestController {
	
	@Value("${APP_NAME}")
	private String appName;
	
	@Value("${AUTOR}")
	private String autor;
	
	@GetMapping
	public ResponseEntity<TestModel> test() {
		return new ResponseEntity<>(new TestModel(appName, autor), HttpStatus.OK);
	}
	
}
