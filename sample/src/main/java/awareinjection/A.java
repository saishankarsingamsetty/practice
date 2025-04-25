package awareinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	@Value("10")
	int a;
	String s;

	A(){
		System.out.println("A calss constructor");
	}
	
}
