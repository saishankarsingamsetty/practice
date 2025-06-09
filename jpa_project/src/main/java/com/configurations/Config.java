package com.configurations;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Scanner scanner() {
		return new Scanner(System.in);
	}
}
