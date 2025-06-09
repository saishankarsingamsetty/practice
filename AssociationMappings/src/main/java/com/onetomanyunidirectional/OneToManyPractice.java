package com.onetomanyunidirectional;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AssociationMappingsApplication;
import com.entitys.Person;
import com.entitys.PhoneNumber;
import com.repositories.PersonRepository;
import com.repositories.PhoneNumberRepository;

@Component
public class OneToManyPractice {

    private final AssociationMappingsApplication associationMappingsApplication;

	@Autowired
	PersonRepository personRepo;
	
	@Autowired
	PhoneNumberRepository phoneNumberRepo;

    OneToManyPractice(AssociationMappingsApplication associationMappingsApplication) {
        this.associationMappingsApplication = associationMappingsApplication;
    }
	
	public void example() {
		PhoneNumber ph1 =new PhoneNumber();
		ph1.setProviderName("airtel");
		ph1.setPhoneNumber(9989998999l);
		
		PhoneNumber ph2 =new PhoneNumber();
		ph2.setProviderName("jio");
		ph2.setPhoneNumber(9989998998l);
		
		Set<PhoneNumber> numbers = new HashSet<>();
		numbers.add(ph1);
		numbers.add(ph2);
		
		Person person = new Person();
		person.setName("shankar");
		person.setAge(22);
		person.setNumbers(numbers);
		
//		personRepo.save(person);
		
//		Person person = personRepo.findById(2001).orElseThrow();
//		System.out.println(person);
		
		
		//delete operation on association mapping
//		Optional<Person> person = personRepo.findById(2001);
//		
//		if(person.isPresent()) {
//			personRepo.delete(person.get());
//			System.out.println("person and childs are deleted");
//		}
//		else {
//			System.out.println("person not found");
//		}
		
		PhoneNumber phnum = phoneNumberRepo.findByPhoneNumber(9989998999l);
		System.out.println(phnum.getPerson().getName());
	}
}
