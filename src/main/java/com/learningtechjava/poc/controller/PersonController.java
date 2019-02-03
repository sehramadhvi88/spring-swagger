package com.learningtechjava.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningtechjava.poc.model.Person;
import com.learningtechjava.poc.service.PersonService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/v2/persons/")
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class PersonController {

    private PersonService personService;
    
    @Autowired
    public PersonController(PersonService personService){
    	this.personService=personService;
    }

    @GetMapping
    @ApiOperation("Returns list of all Persons in the system.")
    public List getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    @ApiOperation("${personController.noteId}")
    public Person getPersonById(@ApiParam("Id of the person to be obtained. Cannot be empty.")
                                    @PathVariable int id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Deletes a person from the system. 404 if the person's identifier is not found.")
    public void deletePerson(@ApiParam("Id of the person to be deleted. Cannot be empty.")
                                 @PathVariable int id) {
        personService.deletePerson(id);
    }

    @PostMapping
    @ApiOperation("Creates a new person.")
    @ApiImplicitParams(
    		   @ApiImplicitParam(name="person", value="${personController.person}") 
    		)
    public Person createPerson(@ApiParam("Person information for a new person to be created.")
                                   @RequestBody Person person) {
        return personService.createPerson(person);
    }

  }

/* @Api - describe whole controller
 * @ApiOperation - describe method operation
 * @ApiParam - describe parameters used 
 * @ApiImplicitParams: This is the wrapper for @ApiImplicitParam annotation. 
 * @ApiImplicitParam: Represents a single parameter in an API operation and is used within
 *  @ApiImplicitParams to provide documentation for REST web service method parameter.
 *   @ApiParam is also used to provide documentation but it is bound to JAX-RS parameter
 * 
 */
