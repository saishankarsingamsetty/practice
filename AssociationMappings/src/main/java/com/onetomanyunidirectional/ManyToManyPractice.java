package com.onetomanyunidirectional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entitys.Doctor;
import com.entitys.Patient;
import com.repositories.DoctorRepository;
import com.repositories.PatientRepository;

@Component
public class ManyToManyPractice {

	@Autowired
	PatientRepository patientrepo;

	@Autowired
	DoctorRepository doctorrepo;

	public void example() {
		Doctor doc1 = new Doctor();
		doc1.setName("doctor1");
		doc1.setSpecilization("cardio");

		Doctor doc2 = new Doctor();
		doc2.setName("doctor2");
		doc2.setSpecilization("physio");

		Patient pat1 = new Patient();
		pat1.setName("patient1");
		pat1.setAge(22);
		pat1.setProblem("headache");

		Patient pat2 = new Patient();
		pat2.setName("patient2");
		pat2.setAge(23);
		pat2.setProblem("fever");

		Set<Patient> patients = new HashSet<>();
		patients.add(pat1);
		patients.add(pat2);

		Set<Doctor> doctors = new HashSet<>();
		doctors.add(doc1);
		doctors.add(doc2);

		doc1.setPatients(patients);
		doc2.setPatients(patients);

		pat1.setDoctors(doctors);
		pat2.setDoctors(doctors);

//		patientrepo.save(pat2);
		doctorrepo.save(doc1);
//		doctorrepo.saveAll(List.of(doc1, doc2));
		
//		patientrepo.save(pat1);
//		Doctor doc = doctorrepo.findById(null)
		
//		Patient pat = patientrepo.findById(8002).orElse(null);
//		System.out.println(pat);
//		System.out.println(pat.getDoctors());
	}

}
