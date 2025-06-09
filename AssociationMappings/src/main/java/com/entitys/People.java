package com.entitys;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class People {

	@Id
	@SequenceGenerator(name = "people_id_gen" ,initialValue = 1001 ,allocationSize = 100)
	@GeneratedValue(generator = "people_id_gen" ,strategy = GenerationType.SEQUENCE)
	int id;
	
	@Column(length = 20)
	String name;
	
	int age;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="passport_id" ,referencedColumnName = "pid")
	Passport passport;
}
