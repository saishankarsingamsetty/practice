package structuraldesignpattern;

public class AdapterTest {
	public static void main(String[] args) {
		PaymentGateway gateway=new NewPaymentGateway();
		gateway.makePayment("hello", 100.09);;
	}
}
