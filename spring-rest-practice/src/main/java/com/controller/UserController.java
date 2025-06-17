package com.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;

@RestController
@RequestMapping("/user-api")
public class UserController {

	 List<User> users = Arrays.asList(
	            new User(1, "Alice", 25),
	            new User(2, "Bob", 30),
	            new User(3, "Charlie", 22),
	            new User(4, "David", 28),
	            new User(5, "Eve", 26),
	            new User(6, "Frank", 33),
	            new User(7, "Grace", 21),
	            new User(8, "Heidi", 29),
	            new User(9, "Ivan", 31),
	            new User(10, "Judy", 27),
	            new User(11, "Karl", 24),
	            new User(12, "Laura", 23),
	            new User(13, "Mallory", 32),
	            new User(14, "Niaj", 30),
	            new User(15, "Olivia", 22),
	            new User(16, "Peggy", 29),
	            new User(17, "Quinn", 25),
	            new User(18, "Rupert", 26),
	            new User(19, "Sybil", 27),
	            new User(20, "Trent", 28)
	        );
	 
	 
	@GetMapping("/wish")
	public ResponseEntity<String> wishMessage(){
		int hours = LocalDateTime.now().getHour();
		String msg="";
		
		if(hours<12) {
			msg= "Good Morning...";
		}
		else if(hours<16) {
			msg = "Good Afternoon...";
		}
		else if (hours<20) {
			msg= "Good Evening";
		}
		else {
			msg = "Good Night";
		}
		
		return new ResponseEntity<String> (msg,HttpStatus.OK);
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user){
		System.out.println(user);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}	
	
	@PostMapping("/report")
	public ResponseEntity<List<User>> report(){
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	
	@PostMapping("/report/{id}")
	public ResponseEntity<User> reportById(@PathVariable int id){
		User resultUser = null;
		for(User user:users) {
			if(user.getId()==id) {
				resultUser=user;
			}
		}
		if(resultUser== null) {
			resultUser= new User();
		}
		return new ResponseEntity<>(resultUser,HttpStatus.OK);
	}
}
