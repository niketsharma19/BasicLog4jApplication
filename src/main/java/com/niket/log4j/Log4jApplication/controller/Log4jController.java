package com.niket.log4j.Log4jApplication.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niket.log4j.Log4jApplication.model.DisplayResponse;
import com.niket.log4j.Log4jApplication.service.Log4jService;

@RestController
@RequestMapping(value = "/log4j")
public class Log4jController {

	private static final Logger logger = LogManager.getLogger(Log4jController.class);
	
	@Autowired
	Log4jService log4jService;
	
	@GetMapping("/helloWorld")
	public DisplayResponse helloWorld() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		logger.trace("Got the request for /helloWorld trace");
		logger.info("Got the request for /helloWorld info");
		logger.debug("Got the request for /helloWorld debug");
		logger.warn("Got the request for /helloWorld warn");
		logger.error("Got the request for /helloWorld error");
		logger.fatal("Got the request for /helloWorld fatal");
		DisplayResponse displayResponse = new DisplayResponse();
		displayResponse.setMessage(log4jService.helloWorld());
		displayResponse.setStatus(HttpStatus.OK);
		return displayResponse;
	}
	
}
