package awareinjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean implements ApplicationContextAware
{
	private ApplicationContext cxt;
	

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.cxt=applicationContext;
	}
	
	public void awareMethod() {
//		ApplicationContext cxt1 =new ClassPathXmlApplicationContext("awareinjection/context.xml");
//		A a = cxt1.getBean(A.class);
		System.out.println(cxt.getBean("a",A.class));
	}

}
