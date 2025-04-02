package behavioraldesignpattern;

public class CreditCardPayment implements PaymentStrategy {

	int creditcardnumber;
	
	CreditCardPayment(int num){
		creditcardnumber=num;
	}
	
	@Override
	public void pay(int amt) {
		System.out.println("amt of "+amt+" is payed using credit card");
	}

}
