package life_cycle_methods;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("life_cycle_methods/context.xml");
		
//		A a = context.getBean("a" ,A.class);
//		B b = context.getBean("b", B.class);
//		C c = context.getBean("c", C.class);
		
		String[] names=context.getBeanDefinitionNames();
		Arrays.sort(names);
		System.out.println(context.getBean("a"));
		System.out.println(context.getBean("a"));
		System.out.println(context.getBean("b"));
		System.out.println(context.getBean("c"));
		
		System.out.println(Arrays.toString(names));
		
		((AbstractApplicationContext) context).close();
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}
}
