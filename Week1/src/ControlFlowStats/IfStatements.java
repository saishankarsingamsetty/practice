package ControlFlowStats;

public class IfStatements {
	public static void main(String[] args) {
		int a=5;
		
		if(a>5) {
			System.out.println("number is greater than 5");
		}
		
		if(a%2==0) {
			System.out.println("number is even");
		}
		
		if(true) {
			System.out.println("under if statement");
		}
		
		if(true&&true||false) {
			System.out.println("hello");
		}
		
		if(m1()) {
			System.out.println("method usage under if");
		}
		
		if(true) {
			if(true) {
				System.out.println("inner if");
			}
			
			if(true) {
				System.out.println("inner 2nd if");
			}
		}
		
		if(true) {
			if(true) {
				if(true) {
					System.out.println("inner-inner if");
				}
			}	
		}
		
	}
	
	static boolean m1() {
		return true;
	}
}
