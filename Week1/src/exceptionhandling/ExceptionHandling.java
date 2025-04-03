package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) throws ArithmeticException {
//		try {
//			try {
//				System.out.println(10/0);
//			}
//			catch(ArithmeticException e) {
//				System.out.println("inner catch");
//				e.printStackTrace();
//			}
//		}
//		catch(ArithmeticException e) {
//			System.out.println("outer catch");
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			try {
//				System.out.println(10/0);
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
//			}
//		}
//		catch(ArithmeticException e) {
//			System.out.println("outer catch ");
//			e.printStackTrace();
//		}
		
//		System.out.println("start");
//		try {
//			System.out.println("outer try");
////			return;
//			try {
//				System.out.println("inner try");
//				int a=10/0;
//				return;
//			}
//			catch(NullPointerException e) {
//				System.out.println("inner  catch");
//			}
//			finally {
//				System.out.println("inner finally");
////				throw new InterruptedException();
//			}
//		}
//		catch(NullPointerException e) {
//			System.out.println("outer catch");
//		}
//		finally {
//			System.out.println("outer finally");
//		}
//		System.out.println("stop");
		
		
//		try {
//		int a=10/0;
//		System.out.println("hello");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		
		try(Scanner scn=new Scanner(System.in);) {
			
			int a=Integer.parseInt(scn.next());
			int b=Integer.parseInt(scn.next());
			
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException  e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
