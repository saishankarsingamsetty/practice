package com.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Pet {

	@Id
	@SequenceGenerator(name = "pet_id_gen",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "pet_id_gen",strategy = GenerationType.SEQUENCE)
	Integer id;
	
	@Column(length = 20)
	@JsonProperty("petname")
	String name;
	
	Integer age;
	
	
}
