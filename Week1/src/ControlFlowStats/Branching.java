package ControlFlowStats;

public class Branching {
	public static void main(String[] args) {
		
		//continue;
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			continue;
		}
		
//		for(int i=1;i<=10;i++) {
//			continue;
//			System.out.println(i);
//		}
//unreachable statement error
		
		for(int i=1;i<=10;i++) {
			if(i==3)
				continue;
			System.out.println(i);
		}
		
		
		//break;
		
//		for(int i=1;i<=10;i++) {
//			break;
//			System.out.println(i);
//		}
		//unreachable statement;
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			break;
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==2)
				break;
		}
		
		for(int i=1;i<=10;i++) {
			if(i==2)
				break;
			System.out.println(i);
		}
		
		abc:for(int i=1;i<=10;i++) {
			System.out.println(i);
			break abc;
		}
		
//		abc:for(int i=1;i<=10;i++) {
//			break abc;
//			System.out.println(i);
//		}
		//unreachable;
		
		
		abc:for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==3)
			break abc;
		}
		
		
		abc:for(int i=1;i<=10;i++) {
			if(i==3)
				break abc;
			System.out.println(i);
		}
		
		
		//return;
		
//		for(int i=1;i<=10;i++) {
//			return;
//		}
		
		System.out.println("after loop with return");
		
		System.out.println("before loop");
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			return;
//		}
		

		
//		for(int i=1;i<=10;i++) {
//			return;
//			System.out.println(i);
//		} //unreachable;
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==3)
			return;
		}
		
		
		System.out.println("after loop with return");
	}
}
