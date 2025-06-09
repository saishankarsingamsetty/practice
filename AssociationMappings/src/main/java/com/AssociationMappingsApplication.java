package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.onetomanyunidirectional.EmbeddedMapping;
import com.onetomanyunidirectional.ManyToManyPractice;
import com.onetomanyunidirectional.OneToManyPractice;
import com.onetomanyunidirectional.OneToOnePractice;

@SpringBootApplication
public class AssociationMappingsApplication {

 



	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(AssociationMappingsApplication.class, args);
//		OneToManyPractice practice = cxt.getBean(OneToManyPractice.class);
//		
//		practice.example();
		
		ManyToManyPractice prac = cxt.getBean(ManyToManyPractice.class);
		prac.example();
		
//		OneToOnePractice prac = cxt.getBean(OneToOnePractice.class);
//		prac.example();
		
//		EmbeddedMapping prac = cxt.getBean(EmbeddedMapping.class);
//		prac.example();
	}

}
