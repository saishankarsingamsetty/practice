package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.People;

public interface PeopleRepository extends JpaRepository<People, Integer> {

}
