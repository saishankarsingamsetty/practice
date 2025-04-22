package TrueId.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class AnimalSoundExample {

	AnimalSoundExample(){
		System.out.println("AnimalSoundExample.AnimalSoundExample()");
	}
	@Autowired
//	@Qualifier("cat")
	private Animal animal;
	
	public void makeAnimalSound() {
		animal.makeSound();
	}
}
