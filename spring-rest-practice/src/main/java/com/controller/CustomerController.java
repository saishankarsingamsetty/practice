package com.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.Customer;

@RestController
//@Controller
@RequestMapping("/customer-api")
public class CustomerController {

	@GetMapping(value = "/report")
	public ResponseEntity<Customer> customerReport() {

		Customer cust = new Customer();
		cust.setId(100);
		cust.setName("shankar");
		cust.setAge(20);
		cust.setFriends(List.of("friend1", "friend2"));
		cust.setDob(LocalDateTime.now());
		cust.setDetails(Map.of("ph1", "9999", "ph2", "8888"));

		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}
	

//	@PostMapping("/register")
//	public ResponseEntity<Customer> register(@RequestBody Customer customer){
//		return new ResponseEntity<>(customer,HttpStatus.OK);
//	}
	
}
