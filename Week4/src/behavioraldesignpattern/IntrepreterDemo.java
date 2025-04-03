package behavioraldesignpattern;

public class IntrepreterDemo {

	public static void main(String[] args) {
		Expression e1=new NumberExpression(6);
		Expression e2=new NumberExpression(3);
		Expression e3=new NumberExpression(5);
		
		Expression e4=new AdditionExpression(e1,e2);
		Expression e5=new SubtractionExpression(e4,e3);
		int a=e5.intrepret();
		System.out.println(a);
	}
}
