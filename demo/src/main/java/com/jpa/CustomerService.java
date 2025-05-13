package com.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public String insertCustomer(Customer customer) {
		Customer c1 = repo.save(customer);
		return c1.getId()!=0?"customer created succefully":"customer creatioin failure";
	}
	
	public String isCustomerAvailable(int id) {
		boolean b = repo.existsById(id);
		
		return b ? "customer available":"customer not available";
	}
	
	public long getCustomersCount() {
		return repo.count();
	}
	
	public Iterable<Customer> getAllCustomers(){
		return repo.findAll();
	}
	
	public Iterable<Customer> getCustomersByIds(Iterable<Integer> ids){
		Iterable<Customer> customers = repo.findAllById(ids);
		return customers;
	}
	
	
	public Optional<Customer> getCustomerById(int id) {
		Optional<Customer> customer = repo.findById(id);
		return customer;
	}
}
