package cyclicinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class B {

	@Autowired
	private A a;
	
	B(){
		System.out.println("B class constructor");
	}
}
