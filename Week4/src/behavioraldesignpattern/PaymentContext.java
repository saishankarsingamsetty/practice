package behavioraldesignpattern;

public class PaymentContext {

	PaymentStrategy paymentmethod;
	
	PaymentContext(PaymentStrategy method){
		this.paymentmethod=method;
	}
	
	public void pay(int amt) {
		paymentmethod.pay(amt);
	}
}
