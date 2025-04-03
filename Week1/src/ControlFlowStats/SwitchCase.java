package ControlFlowStats;

public class SwitchCase {
	public static void main(String[] args) {
		int a=1;
		
		
		switch(a%2) {
		
		case 0:
			System.out.println("even");
			
		case 1:
			System.out.println("odd");
			
		}


		switch(a%2) {
		
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
		
		
		char ch=66;
		
		switch(ch) {
		case 65:
			System.out.println("A");
			break;
			
		case 'B':
			System.out.println("B");
			break;
		
		default:
			System.out.println("Invalid character");
		}
		
		byte b=66;
		
		switch(b) {
		case 65:
			System.out.println("65");
			break;
			
		case 66:
			System.out.println("66");
			break;
		
		default:
			System.out.println("Invalid character");
		}
		
		
		String s="a";
		
		switch(s) {
		case "abc":
			System.out.println("abc");
			break;
			
		case "bcd":
			System.out.println("bcd");
			break;
		
		default:
			System.out.println("default");
				
		}
		
		String ss=null;
		
		switch(ss) {
		case "abc":
			System.out.println("abc");
			break;
			
		case "bcd":
			System.out.println("bcd");
			break;
		
		default:
			System.out.println("default");
				
		}
		
//		char cha=-1;
//		System.out.println(cha);
		days d=days.monday;
		
		
		switch(d) {
		case monday:
			System.out.println(days.monday);
			break;
		default:
			System.out.println("default");
			break;
		}
		
		String day = switch (7) {
        case 1, 7 -> "Weekend"; 
        case 2, 3, 4, 5, 6 -> "Weekday";
        default -> "Invalid day";
        };
        
        
        System.out.println(day);
		
	}
	enum days{
		monday,tuesday,wednesday,thursday,saturday,sunday;
	}
}
