package OOPS;

public class SingleInheritance {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.a);
//		System.out.println(a.b);
		
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		
	}
}

class A{
	static int a=10;
}

class B extends A{
	static int b=20;
}
