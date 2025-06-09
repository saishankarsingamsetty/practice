package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
