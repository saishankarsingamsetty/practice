package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Integer> {

}
