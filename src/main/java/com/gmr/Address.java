package com.gmr;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "address")
public class Address {

	@Id
	private int pid;
	private String city;
	private String state;

}
