package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.exceptions.CustomException;

@Controller
public class BasicController {

//	BasicController(){
//		System.out.println("hello");
//	}
	
	@GetMapping("/")
	public String welcomePage() {
		
//		throw new RuntimeException("exception is raised");
//		throw new CustomException("custom Exception");
		return "hello";
	}
}
