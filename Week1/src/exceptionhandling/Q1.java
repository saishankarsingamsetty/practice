package exceptionhandling;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		try {
			int c=a/b;
			System.out.println(a+" / "+b+" = "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("you are dividing by 0");
			System.out.println("please enter a postive number");
			b=scn.nextInt();
			System.out.println(a+" / "+b+" = "+(a/b));
		}
	}
}
