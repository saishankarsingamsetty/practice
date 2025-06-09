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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Doctor {

	@Id
	@SequenceGenerator(name = "doctor_id_generator" ,initialValue = 1001 ,allocationSize = 100)
	@GeneratedValue(generator = "doctor_id_generator",strategy = GenerationType.SEQUENCE)
	int did;
	
	@Column(length = 20)
	String name;
	
	@Column(length = 20)
	String specilization;
	
	@ManyToMany(targetEntity = Patient.class ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "Doctors_Patients",joinColumns = @JoinColumn( name = "doctor_id",referencedColumnName = "did")
	,inverseJoinColumns = @JoinColumn(name = "patient_id",referencedColumnName = "pid"))
	Set<Patient> patients;
}
