package TrueId.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityExample {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		System.out.println("before");
		AnimalSoundExample example = context.getBean("soundexample",AnimalSoundExample.class);
		System.out.println("after");
		example.makeAnimalSound();
		
		((AbstractApplicationContext) context).close();
	}
}
