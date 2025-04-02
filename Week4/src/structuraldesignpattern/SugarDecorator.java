package structuraldesignpattern;

public class SugarDecorator extends CoffeDecorator{

	SugarDecorator(Coffee coffee){
		super(coffee);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription().concat(" + suger");
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+0.1;
	}
}
