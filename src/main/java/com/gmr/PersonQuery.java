package com.gmr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class PersonQuery implements GraphQLQueryResolver {

	@Autowired
	PersonRepository personRepository;

	public Person findPerson(int pid) {
		return personRepository.findPersonByPid(pid);
	}
}