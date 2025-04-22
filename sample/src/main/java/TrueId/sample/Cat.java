package TrueId.sample;

import org.springframework.context.annotation.Primary;

public class Cat implements Animal {

	Cat(){
		System.out.println("Cat.Cat()");
	}
	@Override
	public void makeSound() {
		System.out.println("Cat making sound");

	}

}
