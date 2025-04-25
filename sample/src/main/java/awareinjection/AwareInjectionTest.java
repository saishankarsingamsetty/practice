package awareinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareInjectionTest {

	public static void main(String[] args) {
		ApplicationContext cxt =new ClassPathXmlApplicationContext("awareinjection/context.xml");
		MyBean bean = cxt.getBean(MyBean.class);
		
		bean.awareMethod();
	}
}
