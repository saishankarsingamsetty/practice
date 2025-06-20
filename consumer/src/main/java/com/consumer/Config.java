package com.consumer;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.consumer")
public class Config {

	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
	
	@Bean
	Scanner scanner() {
		return new Scanner(System.in);
	}
}
