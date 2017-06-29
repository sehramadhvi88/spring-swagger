package com.example.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/api/swaggerhello")
	public String sayHello(){
		return "Swagger hello world";
	}
	
}
