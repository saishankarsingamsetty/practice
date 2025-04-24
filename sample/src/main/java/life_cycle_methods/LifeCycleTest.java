package life_cycle_methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("life_cycle_methods/context.xml");
		
//		A a = context.getBean("a" ,A.class);
//		B b = context.getBean("b", B.class);
//		C c = context.getBean("c", C.class);
		
		((AbstractApplicationContext) context).close();
	}
}
