package com.example.poc.model;

import static org.junit.Assert.assertFalse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Hello {

	String message;
	String name;
	String id;
	
	public Hello() {
		super();
		message = "Constructor message";
	}
	
	

	public Hello(String message, String name, String id) {
		super();
		this.message = message;
		this.name = name;
		this.id = id;
	}


	@ApiModelProperty(value="Welcome msg",required=false, position=2)
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@ApiModelProperty(value="dummy",required=true, position=1)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
