package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int a=scn.nextInt();
		
		int[] ia=new int[5];
		
		try {
			System.out.println(ia[a]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of bounds");
		}
		
	}
}
