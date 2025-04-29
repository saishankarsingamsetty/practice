package project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class POS {


	@Autowired
	@Qualifier("service")
	private PaymentService paymentService;


	private double amt;
	
	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	
	public void payment(double amt) {
		paymentService.pay(amt);
		this.amt+=amt;
	}
	
	public void viewPosBalance() {
		System.out.println("current balance is : "+amt);
	}
	
}
