package com.niket.log4j.Log4jApplication.model;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class DisplayResponse {
	
	private String message;
	private HttpStatus status;

}
