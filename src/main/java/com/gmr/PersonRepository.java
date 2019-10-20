package com.gmr;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, ObjectId> {

	List<Person> findAll();
	
	Person findPersonByName(String name);
}
