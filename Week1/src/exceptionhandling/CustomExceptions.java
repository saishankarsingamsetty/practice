package exceptionhandling;

import java.util.Scanner;

public class CustomExceptions {
	
	public static void main(String[] args)throws Exception {
		System.out.println("start");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your age");
		
		
		int	a=Integer.parseInt(scn.nextLine());
		
		if(a<=0) {
				throw new NegativeAgeException();
		}
		else {
			if(a<18) {
					throw new AgeNotSufficientException("you are not elegible to vote");
			}
			else {
				System.out.println("you are eligible to vote");
			}
		}
		System.out.println("end");
		
	}//main

}

class AgeNotSufficientException extends Exception{
	
	public AgeNotSufficientException() {
		
	}
	
	public AgeNotSufficientException(String msg) {
		super(msg);
	}
	
}


class NegativeAgeException extends Exception{
	
	public NegativeAgeException() {
		
	}
	
	public NegativeAgeException(String msg) {
		super(msg);
	}
}


