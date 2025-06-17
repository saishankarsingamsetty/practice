package com.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Customer {

	int id;
	String name;
	int age;
	
	List<String> friends;
	LocalDateTime dob;
	Map<String,String> details;
}
