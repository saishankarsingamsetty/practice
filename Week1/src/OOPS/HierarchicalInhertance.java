package OOPS;

public class HierarchicalInhertance {
	public static void main(String[] args) {
		AAA a=new AAA();
		BBB b=new BBB();
		CCC c =new CCC();
		DDD d= new DDD();
		
		System.out.println(a.a);
//		System.out.println(a.b);
		
		
		System.out.println(b.a);
		System.out.println(b.b);
//		System.out.println(b.c);
		
		System.out.println(c.a);
		System.out.println(c.c);
		
		System.out.println(d.a);
		System.out.println(d.d);
		
		
	}
}

class AAA{
	int a=10;
}

class BBB extends AAA{
	int b=20;
}

class CCC extends AAA{
	int c=20;
}

class DDD extends AAA{
	int d=20;
}

