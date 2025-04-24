package cyclicinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A {

	@Autowired
	private B b;
	
	A(){
		System.out.println("A class constructor");
	}
}
