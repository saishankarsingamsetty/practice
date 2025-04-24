package singleton_and_prototype_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("a")
@Scope("singleton")
public class A {

	A(){
		System.out.println("a class constructor");
	}
	
}
