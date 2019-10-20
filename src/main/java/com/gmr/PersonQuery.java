package com.gmr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class PersonQuery implements GraphQLQueryResolver {
	@Autowired
	PersonRepository personRepository;
	
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
	
	public Person findPerson(String name) {
		return personRepository.findPersonByName(name);
	}
}
