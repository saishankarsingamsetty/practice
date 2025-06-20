package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringRestPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestPracticeApplication.class, args);
	}

}
