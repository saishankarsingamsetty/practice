package cyclicinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyclicInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cyclicinjection/context.xml");
		
		A a= context.getBean("a1",A.class);
		B b= context.getBean("b1",B.class);
		
		System.out.println(a);
		System.out.println(b);
	}
}
