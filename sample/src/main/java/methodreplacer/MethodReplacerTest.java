package methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("methodreplacer/context.xml");
		
		Bank bank = context.getBean("bank",Bank.class);
		bank.calculateIntrest(10, 10, 10);
		
		((AbstractApplicationContext) context).close();
	}
}
