package creationaldesignpattern;


public class FactoryPatternDemo {
	public static void main(String[] args) {
		
		Car car= CarFactory.createCar("bmw");
		
		System.out.println(car);
		
		Car car1=CarFactory.createCar("Audi");
		System.out.println(car1);
		
//		Car car2=CarFactory.createCar("volvo");
//		System.out.println(car2);
		
		car=CarFactory.createAudiCar();
		System.out.println(car);
		
		car= CarFactory.createBMWCar();
		System.out.println(car);
	}
}
