package life_cycle_methods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("c")
public class C {

	C(){
		System.out.println("C class constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("c class init()");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("c class destroy()");
	}
}
