package lookupinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lookupinjection/context.xml");
		LookupInjection obj = context.getBean("lookupInjection",LookupInjection.class);
		obj.invokationMethod();
		obj.invokationMethod();
		obj.invokationMethod();
		obj.invokationMethod();
		obj.invokationMethod();
		obj.invokationMethod();
		obj.invokationMethod();
		
		((AbstractApplicationContext) context).close();
	}
}
