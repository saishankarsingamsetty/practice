package structuraldesignpattern;

public class MilkDecorator extends CoffeDecorator{
	MilkDecorator(Coffee coffee){
		super(coffee);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+" + milk";
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+0.15;
	}
}
