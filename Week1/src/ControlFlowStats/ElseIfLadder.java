package ControlFlowStats;

public class ElseIfLadder {
	public static void main(String[] args) {
		int a=10;
//		a=-1;
//		a=0;
		
		if(a>0) {
			System.out.println("number is greater than zero");
		}
		else if(a<0) {
			System.out.println("number id less than zero");
		}
		else if(a==0) {
			System.out.println("number is equal to zero");
		}
		
		a=100;
		int b=500;
		int c=1;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest");
			}
			else {
				System.out.println("c id largest");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is largest");
			}
			else {
				System.out.println("c is largest");
			}
		}
		
		
		if(a>b&&a>c) {
			System.out.println("a is largest");
		}
		else if(b>c) {
			System.out.println("b is largest");
		}
		else
			System.out.println("c is largest");
		
		
	}
}
