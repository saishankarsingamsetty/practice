package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=0;
		int b=0;
		try {
			
			a=scn.nextInt();
			b=scn.nextInt();
			System.out.println("a = "+a+" b = "+b);
		}
		catch(InputMismatchException e) {
			System.out.println("please do not enter other than number");
			System.out.println("Please re-enter the numbers");
			scn.next();
			a=scn.nextInt();
			b=scn.nextInt();
			System.out.println("a = "+a+" b = "+b);
		}
		
		
	}
}
