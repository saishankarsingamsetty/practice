package com.models;

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
	String name;
	
	Integer age;
	
	
}
