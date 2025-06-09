package com.entitys;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@SequenceGenerator(name = "person_id_gen",allocationSize = 1,initialValue = 2001)
	@GeneratedValue(generator = "person_id_gen" ,strategy = GenerationType.SEQUENCE)
	int personId;
	
	@Column(length = 20)
	String name;
	
	int age;
	
	@OneToMany(targetEntity = PhoneNumber.class ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id" ,referencedColumnName = "personId")
	Set<PhoneNumber> numbers;
}
