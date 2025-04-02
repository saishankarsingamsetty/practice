package behavioraldesignpattern;

public class StrategyDemo {
	public static void main(String[] args) {
		PaymentContext context=new PaymentContext(new UPIPayment(12345));
		
		context.pay(100);
		
		context=new PaymentContext(new CreditCardPayment(123456666));
		context.pay(200);
	}
}
