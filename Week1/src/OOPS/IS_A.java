package OOPS;

public class IS_A {
	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		
		d.makeSound();
		c.makeSound();
		
		System.out.println(d instanceof Animal1);
		System.out.println(c instanceof Animal1);
		System.out.println(d instanceof Dog);
		System.out.println(c instanceof Cat);
	}
}

class Animal1{
	void makeSound() {
		System.out.println("Animal");
	}
}

class Dog extends Animal1{
	void makeSound() {
		System.out.println("Dog");
	}
}

class Cat extends Animal1{
	void makeSound() {
		System.out.println("Cat");
	}
}
