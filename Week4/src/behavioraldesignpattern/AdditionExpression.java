package behavioraldesignpattern;

public class AdditionExpression implements Expression {

	Expression left,right;
	AdditionExpression(Expression left,Expression right){
		this.left=left;
		this.right=right;
	}
	@Override
	public int intrepret() {
		return left.intrepret()+right.intrepret();
	}

}
