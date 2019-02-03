package com.learningtechjava.poc.service;

import java.util.ArrayList;
import java.util.List;

import com.learningtechjava.poc.model.Person;

public interface PersonService {
	
	public static List persons = new ArrayList<Person>();
		
	List getAllPersons();
	Person getPersonById(int id);
	void deletePerson(int id);
	Person createPerson(Person person);
}
