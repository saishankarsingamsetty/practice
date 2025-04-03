package behavioraldesignpattern;

public class SubtractionExpression implements Expression {
	Expression left,right;
	
	SubtractionExpression(Expression left,Expression right){
		this.left=left;
		this.right=right;
	}

	@Override
	public int intrepret() {
		return left.intrepret()-right.intrepret();
	}

}
