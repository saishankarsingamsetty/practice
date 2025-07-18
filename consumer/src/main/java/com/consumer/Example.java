package com.consumer;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Example {

	@Autowired
	RestTemplate template;
	
	@Autowired
	Scanner scanner;
	
	public void restExample() {
		String url = "http://localhost:3031/user-api/wish";
		String result = template.getForObject(url, String.class);
		System.out.println(result);
		
	}
	
	public void printPet() {
		
		String url = "http://localhost:3031/pet-api/report/"+scanner.nextInt();
//		Pet result = template.getForObject(url, Pet.class);
//		System.out.println(result);
		
	    try {
	        ResponseEntity<String> response = template.getForEntity(url, String.class);
	        String body = response.getBody();
	        
	        // Try parsing it to Pet only if it looks like a JSON object
	        if (body != null && body.trim().startsWith("{")) {
	            ObjectMapper mapper = new ObjectMapper();
	            Pet pet = mapper.readValue(body, Pet.class);
	            System.out.println(pet);
	        } else {
	            System.out.println("Server Message: " + body);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	public void pathVariableExample() {
		String url = "http://localhost:3031/pet-api/report/{id}";
		Pet result = template.getForObject(url, Pet.class, new Object[]{scanner.nextInt()});
		System.out.println(result);
	}
	
	//registering the pet using the post mapping
	public void usingPostMappingRegisteringPet() {
		String url = "http://localhost:3031/pet-api/register";
		
		String body= """
				
				{
				"name" : "pet3",
				"age" : 23
				}
				
				""";
		
		//build headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		//build request object
		HttpEntity<String> request = new HttpEntity<String>(body, headers);
		
		ResponseEntity<String> response = template.postForEntity(url, request, String.class);
		
		System.out.println(response.getBody());

	}
	
	
	//getting the list of json objects
	
	
	public void gettingListOfPetObjects() throws JsonMappingException, JsonProcessingException {
		String url = "http://localhost:3031/pet-api/report";
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		System.out.println(response.getBody());
		
		ObjectMapper mapper = new ObjectMapper();
		List<Pet> pets = mapper.readValue(response.getBody(), new TypeReference<List<Pet>>() {});
		
		System.out.println(pets);
	}
}
