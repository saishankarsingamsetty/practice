package OOPS;

public class MultiLevelInheritance {
	public static void main(String[] args) {
		AA a=new AA();
		BB b=new BB();
		CC c=new CC();
		
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
		
		System.out.println(b.a);
		System.out.println(b.b);
//		System.out.println(b.c);
		
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
	}
}

class AA{
	int a=10;
}

class BB extends AA{
	int b=20;
}

class CC extends BB{
	int c=30;
}
