package com.gmr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class PersonResolver implements GraphQLResolver<Person> {

	@Autowired
	private AddressRepository addressRepository;

	public Address getAddress(Person person) {
		return addressRepository.findAddressByPid(person.getPid());
	}

}
