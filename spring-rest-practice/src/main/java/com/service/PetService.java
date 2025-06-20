package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.models.Pet;
import com.repository.PetRepository;

import jakarta.transaction.Transactional;

@Service
public class PetService {

	@Autowired
	PetRepository petRepository;
	
	@Transactional
	public Integer registerPet(Pet pet) {
		Integer id = petRepository.save(pet).getId();
//		throw new RuntimeException("hello");
		return id;
	}
	
	
	public List<Pet> petList(){
		return (List<Pet>) petRepository.findAll();
	}
	
	public Pet getPetById(Integer id) {
		Pet pet = petRepository.findById(id).orElse(null);
		return pet;
	}
	
	public void restExample() {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:3031/user-api/wish";
		String result = template.getForObject(url, String.class);
		System.out.println(result);
	}
}
