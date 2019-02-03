package com.learningtechjava.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api("This is swagger api documentation") // describes whole controller
public class HelloController {

	
	@GetMapping("/api/swaggerhello")
	@ApiOperation("Return String hello swagger")// describes method operation
	public String sayHello(){
		return "Swagger hello world";
	}
	
	@PostMapping("/post-hello/{id}")
    @ApiOperation("This is the POST request")
    public String postReq(@ApiParam("Id of the person to be obtained. Cannot be empty.") @PathVariable int id) {
        return "post , id is ="+id;
    }
	
}
