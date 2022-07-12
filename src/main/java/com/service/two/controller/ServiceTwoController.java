package com.service.two.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.two.service.ServiceTwoClassImpl;

@RestController
@RequestMapping("/servicetwo")
public class ServiceTwoController {
	 @Autowired
	 ServiceTwoClassImpl serviceClass;
	 
	
    @GetMapping("/username")
    public ResponseEntity<String> serviceTwo(){
    	return serviceClass.ConcatenatedString();
    }

}
