package structuraldesignpattern;

public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "simple coffee";
	}

	@Override
	public double getPrice() {
		return 10.0;
	}

}
