package com.consumer;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
		Pet result = template.getForObject(url, Pet.class);
		System.out.println(result);
	}
}
