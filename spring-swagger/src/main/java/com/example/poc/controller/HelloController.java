package com.example.poc.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.model.Hello;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class HelloController {

	
	@GetMapping("/api/swaggerhello")
	public String sayHello(){
		return "Swagger hello world";
	}
	
	@ApiOperation(value = "getMessage" , nickname="getMessage" , notes="get Message")
	@ApiResponses(value={
			@ApiResponse(code=500,message = "Server error"),
			@ApiResponse(code=404,message = "Service not found"),
			@ApiResponse(code=200,message = "Successful Retrivel" ,response=Hello.class , responseContainer="List")
	})
	@GetMapping("/api/swaggerhelloOperation/{name}")
	public ArrayList<Hello> sayHelloOperation(@ApiParam(value="user name",required=true,defaultValue="madhvi") 
										@PathVariable("name") String name){
		
		ArrayList<Hello> arrayList = new ArrayList<>();
		arrayList.add(new Hello("hello msg",name,"1"));   
		return arrayList;
	}
	
}
