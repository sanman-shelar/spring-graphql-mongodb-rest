package com.gmr;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "person")
public class Person {

	@Id
	private int pid;
	private String name;
	private int age;

}
