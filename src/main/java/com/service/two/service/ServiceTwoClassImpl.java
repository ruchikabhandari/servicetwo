package com.service.two.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwoClassImpl {

	public ResponseEntity<String> ConcatenatedString() {
		
		 return ResponseEntity.status(HttpStatus.OK).body("Hello");
	}

}
