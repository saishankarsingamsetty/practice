package creationaldesignpattern;

public class CarFactory {
	public static Car createCar(String name) {
		if(name.equalsIgnoreCase("audi")) {
			return new Audi();
		}
		else if(name .equalsIgnoreCase("bmw")) {
			return new BMW();
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	
	public static Car createBMWCar() {
		return new BMW();
	}
	
	public static Car createAudiCar() {
		return new Audi();
	}
}
