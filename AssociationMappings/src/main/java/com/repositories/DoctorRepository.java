package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
