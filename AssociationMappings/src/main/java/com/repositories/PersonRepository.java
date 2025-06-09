package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
