package singleton_and_prototype_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b")
@Scope("prototype")
public class B {

	B(){
		System.out.println(" B class constructor");
	}
	

	public void destroy() {
		System.out.println("b object is destroyed");
	}
}
