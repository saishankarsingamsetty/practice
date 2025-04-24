package life_cycle_methods;

import org.springframework.stereotype.Component;


public class A {

	A(){
		System.out.println("A class constructor");
	}
	
	public void init() {
		System.out.println("A class inti()");
	}
	
	public void destroy() {
		System.out.println("A class destroy");
	}
}
