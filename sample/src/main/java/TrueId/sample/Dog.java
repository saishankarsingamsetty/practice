package TrueId.sample;

public class Dog implements Animal {
	Dog(){
		System.out.println("Dog.Dog()");
	}

	@Override
	public void makeSound() {
		System.out.println("dog making sound");
	}

}
