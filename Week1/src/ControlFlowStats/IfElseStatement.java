package ControlFlowStats;

public class IfElseStatement {
	public static void main(String[] args) {
		
		int a=5;
		
		if(a>5) {
			System.out.println("number is greater than 5");
		}
		else {
			System.out.println("the number id less than 5");
		}
		
		
		if(a%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
//		if(true) {
//			System.out.println("under if statement");
//		}
//		else {
//			System.out.println("under else statement");
//		}
//		
//		if(true&&true||false) {
//			System.out.println("hello");
//		}
//		else {
//			System.out.println("else statement");
//		}
		
		if(m1()) {
			System.out.println("method usage under if");
		}else {
			System.out.println("method usage under else");
		}
		
		//inner if statements
		
		a=1;
		int b=2;
		
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		if(a>b) {
			if(a>b) {
				System.out.println("a>b");
			}
			else {
				System.out.println("a<b");
			}
		}
		else {
			if(a>b) {
				System.out.println("a>b");
			}
			else {
				System.out.println("a<b");
			}
		}
		
		
		
	}
	
	static boolean m1() {
		return true;
	}
}
