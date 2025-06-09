package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
