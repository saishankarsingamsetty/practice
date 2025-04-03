package project;

import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable {
	private final int  accNum;
	private String holderName;
	private double balance;
	private ArrayList<String> transactionHistory;
	private double loanAmount;
	
	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	Account(int accNum,String holderName,double balance,ArrayList<String> transactionHistory){
		this.accNum=accNum;
		this.holderName=holderName;
		this.balance=balance;
		this.transactionHistory=transactionHistory;
	}
	
	

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", holderName=" + holderName + ", balance=" + balance
				+ ", transactionHistory=" + transactionHistory + ", loanAmount=" + loanAmount + "]";
	}

	public int getAccNum() {
		return accNum;
	}
	
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public ArrayList<String> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(ArrayList<String> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	
}
