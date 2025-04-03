package behavioraldesignpattern;

public class NumberExpression implements Expression {

	int number;
	
	NumberExpression(int number){
		this.number=number;
	}
	
	@Override
	public int intrepret() {
		return number;
	}

}
