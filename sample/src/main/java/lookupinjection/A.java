package lookupinjection;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class A {

	@Value("10")
	int a ;
	@Value("hello")
	String s;
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroyed");
	}
}
