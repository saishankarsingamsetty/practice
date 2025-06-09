package com.entitys;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Entity
@Data
public class PhoneNumber {

	@Id
	@SequenceGenerator(name = "phnum_id_gen" ,allocationSize = 1 , initialValue = 1001)
	@GeneratedValue(generator = "phnum_id_gen" , strategy = GenerationType.SEQUENCE)
	int phoneNumberId;
	
	@Column(length = 20)
	String providerName;
	
	long phoneNumber;
	
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id" ,referencedColumnName = "personId")
	Person person;
}
