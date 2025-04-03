package behavioraldesignpattern;

public class UPIPayment implements PaymentStrategy {

	int id;
	UPIPayment(int id){
		this.id=id;
	}
	
	@Override
	public void pay(int amt) {
		System.out.println("amt of"+amt+" is payed using upi");
	}

}
