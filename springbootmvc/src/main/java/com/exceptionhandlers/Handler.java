package com.exceptionhandlers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exceptions.CustomException;


@ControllerAdvice
public class Handler {

	
	
	@ExceptionHandler(CustomException.class)
	public String errorPage1(Exception e, Model model) {
		model.addAttribute("exception", e.getMessage());
		return "errorpage";
	}
	
	
	@ExceptionHandler(Exception.class)
	public String errorPage(Exception e, Model model) {
		model.addAttribute("exception", e.getMessage());
		return "errorpage";
	}
	

}
