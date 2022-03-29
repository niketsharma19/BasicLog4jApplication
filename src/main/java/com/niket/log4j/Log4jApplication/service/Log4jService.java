package com.niket.log4j.Log4jApplication.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Log4jService {
	
//	private static final Logger logger = LogManager.getLogger(Log4jService.class);
	
	public String helloWorld() {
		log.trace("At Service Call trace");
		log.info("At Service Call info");
		log.debug("At Service Call debug");
		log.warn("At Service Call warn");
		log.error("At Service Call error");
		return "Hello World";
	}

}
