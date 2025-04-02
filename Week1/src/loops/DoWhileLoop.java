package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
		
//		do {
//			System.out.println(i);
//			i++;
//		}while(true);
		
//		int a=0;
//		do {
//			a=new Scanner(System.in).nextInt();
//			
//		}while(a!=2);
		
		
		do {
			System.out.println("hello");
			break;
		}while(true);
		
		
	}
}
