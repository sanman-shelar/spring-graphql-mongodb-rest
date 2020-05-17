package com.gmr;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AddressRepository extends PagingAndSortingRepository<Address, Integer> {

	Address findAddressByPid(int pid);
}
