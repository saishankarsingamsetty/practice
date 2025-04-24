package TrueId.sample;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class AnimalSoundExample {
	@Autowired
	public LocalDate date;
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
