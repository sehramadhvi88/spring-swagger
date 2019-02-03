package com.learningtechjava.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learningtechjava.poc.model.Person;

@Service
public class PersonServiceImplementation implements PersonService {

	@SuppressWarnings("unchecked")
	public PersonServiceImplementation() {
		// TODO Auto-generated constructor stub
		persons.add(new Person(1,"John","Criss",36));
		persons.add(new Person(2,"Tom","Jeff",26));
		persons.add(new Person(3,"Sally","Sui",27));
		persons.add(new Person(4,"Roman","Chicksov",30));
		persons.add(new Person(5,"Chan","Ching",31));
				
	}
	
	@Override
	public List getAllPersons() {
		// TODO Auto-generated method stub
		return persons;
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return (Person) persons.get(id);
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		persons.remove(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		persons.add(person);
		return person;
	}

}
