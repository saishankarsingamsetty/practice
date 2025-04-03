package structuraldesignpattern;

public abstract class CoffeDecorator implements Coffee {
	
	protected Coffee simplecoffee;
	
	CoffeDecorator(Coffee coffee){
		this.simplecoffee=coffee;
	}

	@Override
	public String getDescription() {	
		return simplecoffee.getDescription();
	}

	@Override
	public double getPrice() {
		return simplecoffee.getPrice();
	}

}
