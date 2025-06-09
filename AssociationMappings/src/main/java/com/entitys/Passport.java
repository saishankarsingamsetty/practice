package com.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Passport {

	@Id
	@SequenceGenerator(name = "passport_id_gen" ,initialValue = 2001 ,allocationSize = 100)
	@GeneratedValue(generator = "passport_id_gen" ,strategy = GenerationType.SEQUENCE)
	int pid;
	
	long passportnumber;
}
