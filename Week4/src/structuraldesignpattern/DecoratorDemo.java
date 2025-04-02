package structuraldesignpattern;

public class DecoratorDemo {

	public static void main(String[] args) {
		SimpleCoffee coffee=new SimpleCoffee();
		System.out.println("simple coffe description : "+ coffee.getDescription()+"\tsimple coffe price : "+coffee.getPrice());
		
		CoffeDecorator milkdecorator=new MilkDecorator(coffee);
		System.out.println("milk decorator description : "+ milkdecorator.getDescription()+"\tmilk decorator price : "+milkdecorator.getPrice());
		
		
		SugarDecorator sugardecorator=new SugarDecorator(coffee);
		System.out.println("sugar decorator description : "+ sugardecorator.getDescription()+"\tsugar decorator price : "+sugardecorator.getPrice());
	}

}
