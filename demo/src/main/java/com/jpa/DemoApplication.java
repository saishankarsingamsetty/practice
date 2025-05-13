package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(DemoApplication.class, args);
		
		CustomerService service = cxt.getBean(CustomerService.class);
		
		//save method 
		System.out.println(service.insertCustomer(new Customer(1001,"akash a","akash","akash@gmail.com")));
		
		
//		//exists by id method
//		System.out.println(service.isCustomerAvailable(1001));
//		
//		
//		//count method;
//		System.out.println(service.getCustomersCount());
//		
//		Iterable<Customer> customers = service.getAllCustomers();
//		
//		customers.forEach(System.out::println);
//		
//		
		Iterable<Customer> customers1 = service.getCustomersByIds(List.of(100,102,102,1,1));
//		
//		int length = ((List) customers1).size();
//		System.out.println(length);
//		customers1.forEach(System.out::println);
		
		System.out.println(service.getCustomerById(1001).orElseThrow(()-> new RuntimeException("customer not found")));
		
	}

}
