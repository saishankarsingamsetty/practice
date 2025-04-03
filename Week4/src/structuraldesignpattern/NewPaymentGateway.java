package structuraldesignpattern;

public class NewPaymentGateway implements PaymentGateway {

	private OldPaymentGateway gateway=new OldPaymentGateway();
	
	@Override
	public void makePayment(String s,double amt) {
		gateway.makePayment(amt);
		System.out.println("new payment gateway");
	}

}
