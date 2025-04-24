package valueAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAttributeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("valueAttribute/PersonConfig.xml");
		ValueAttribute ex = context.getBean("example",ValueAttribute.class);
		System.out.println(ex);
	}
}
