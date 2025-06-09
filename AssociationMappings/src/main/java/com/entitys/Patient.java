package com.entitys;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Patient {
	@Id
	@SequenceGenerator(name = "Patient_id_generator" ,initialValue = 2001 ,allocationSize = 1000)
	@GeneratedValue(generator = "Patient_id_generator",strategy = GenerationType.SEQUENCE)
	int pid;
	
	@Column(length = 20)
	String name;
	
	int age;
	
	@Column(length = 20)
	String problem;
	
	@ManyToMany(mappedBy = "patients",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Doctor> doctors;
}
