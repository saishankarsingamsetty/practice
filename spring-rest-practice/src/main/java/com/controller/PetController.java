package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Pet;
import com.service.PetService;

@RestController
@RequestMapping("/pet-api")
public class PetController {



	@Autowired
	PetService petService;

	@PostMapping("/register")
	public ResponseEntity<String> registerPet(@RequestBody Pet pet){
		try {
			Integer regId = petService.registerPet(pet);
			return new ResponseEntity<String>("pet is registered with id "+regId,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.OK	);
		}
	}
	
	@GetMapping("/report")
	public ResponseEntity<List<Pet>> report(){
		return new ResponseEntity<List<Pet>> (petService.petList(),HttpStatus.OK);
	}
	
	
	@GetMapping("/report/{id}")
	public ResponseEntity<?> report(@PathVariable Integer id){
		Pet pet = petService.getPetById(id);
		if(null != pet)
		return new ResponseEntity<Pet> (pet,HttpStatus.OK);
		
		return new ResponseEntity<String> ("no user found with the id "+id,HttpStatus.OK);
	}
	
	@GetMapping("/resttemplate")
	public void restTemplate() {
		petService.restExample();
	}
}
