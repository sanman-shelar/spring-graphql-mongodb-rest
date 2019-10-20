package com.gmr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Service
public class PersonMutation implements GraphQLMutationResolver {

	@Autowired
	PersonRepository personRepository;
	
	public Person addPerson(Person person) {
		return personRepository.save(person);
	}
}
