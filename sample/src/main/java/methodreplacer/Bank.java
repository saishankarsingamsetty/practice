package methodreplacer;

public class Bank {

	public double calculateIntrest(int p,int t,int r) {
		System.out.println("actual method");
		return (p*t*r)/100.0;
	}
}
