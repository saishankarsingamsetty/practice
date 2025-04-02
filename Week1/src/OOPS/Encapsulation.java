package OOPS;

public class Encapsulation {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		if(ba.getBalance()<500) {
			ba.setBalance(1000);
		}
		
		System.out.println(ba.getBalance());
	}
}

class BankAccount{
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
}
