package singleton_and_prototype_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("singleton_and_prototype_scope/context.xml");
		A a1 = context.getBean("a",A.class);
		A a2 = context.getBean("a",A.class);
		A a3 = context.getBean("a",A.class);
		
		System.out.println(a1+"		"+a2+"		"+a3);
		
		B b1 = context.getBean("b",B.class);
		B b2 = context.getBean("b",B.class);
		B b3 = context.getBean("b",B.class);
		System.out.println(b1+"		"+b2+"		"+b3);

		((AbstractApplicationContext) context).close();
	}
}
