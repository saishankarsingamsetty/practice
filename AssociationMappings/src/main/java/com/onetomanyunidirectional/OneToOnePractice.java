package com.onetomanyunidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entitys.Passport;
import com.entitys.People;
import com.repositories.PassportRepository;
import com.repositories.PeopleRepository;


@Component
public class OneToOnePractice {

	@Autowired
	PeopleRepository peoplerepo;
	
	@Autowired
	PassportRepository passportrepo;
	
	public void example() {
		People p1 = new People();
		p1.setName("shankar");
		p1.setAge(22);
		
		
		Passport pass1 = new Passport();
		pass1.setPassportnumber(99899989l);
		p1.setPassport(pass1);
		
		
		peoplerepo.save(p1);
	}
}
