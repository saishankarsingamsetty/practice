package project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class GooglePayService implements PaymentService{

	@Override
	public void pay(double amt) {
		System.out.println("payment of "+amt +" is payed through GooglePayService");
	}

}
