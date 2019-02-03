package com.learningtechjava.poc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "class represention a person tracked by application" )
public class Person {
	
	public Person(){
		
	} 
	
	public Person(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	//JSR 303 bean validation -- allows to annotate field of java classes to declare constraints and validation rules.
	
	@NotNull 
	@ApiModelProperty(notes="Unique identifier of person. No two persons can have the same id.", example = "1" ,required = true , position=0)
	private int id;
	
	@NotBlank
	@Size(min=1,max= 20)
    @ApiModelProperty(notes = "First name of the person.", example = "John", required = true, position = 1)
	private String firstName;
	
	@NotBlank
	@Pattern(regexp = "[some regular expression]")
    @ApiModelProperty(notes = "Last name of the person.", example = "Doe", required = true, position = 2)
	private String lastName;
	
	@Min(0)
	@Max(100)
    @ApiModelProperty(notes = "Age of the person. Non-negative integer", example = "42", position = 3)
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}


/* On class level we have used @ApiModel and on field level @ApiModelProperty (useful for providing example values for the 
 * guidance of users but also used to prefill the request payload )
 * we can mix and match with JSR-303 annotations
 *  
 * 
 * 
*/
