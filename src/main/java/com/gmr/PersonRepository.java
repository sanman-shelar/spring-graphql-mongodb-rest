package com.gmr;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

	Person findPersonByPid(int pid);
}
