package project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public interface PaymentService {

	public void pay(double amt);
}
