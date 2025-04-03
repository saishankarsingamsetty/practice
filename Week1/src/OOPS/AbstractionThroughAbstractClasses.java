package OOPS;

public class AbstractionThroughAbstractClasses {
	public static void main(String[] args) {
		BMW car=new BMW();
		Car car1=new BMW();
		
		car.speedUp();
		car.applyBreaks();
		car.move();
		
		car1.speedUp();
		car1.applyBreaks();
//		car1.move();
	}
}

abstract class Car{
	abstract void speedUp();
	
	void applyBreaks() {
		System.out.println("applying breaks");
	}
	
}

class BMW extends Car{
	public void speedUp() {
		System.out.println("speeding up the car");
	}
	
	public void move() {
		System.out.println("moving");
	}
}
