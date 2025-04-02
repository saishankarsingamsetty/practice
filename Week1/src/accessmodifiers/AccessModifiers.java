package accessmodifiers;

public class AccessModifiers {
	private static int a=10;
	static int b=20;
	protected static int c=30;
	public static int d=40;
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		System.out.println(b);
		m2();
		
		System.out.println(c);
		m3();
		
		System.out.println(d);
		m4();
		
	}
	
	private static void m1() {
		System.out.println("m1()");
	}
	
	static void m2() {
		System.out.println("m2()");
	}
	
	protected static void m3() {
		System.out.println("m3()");
	}
	
	public static void m4() {
		System.out.println("m4()");
	}
	
}

class abc{
	static void m2() {
		System.out.println(AccessModifiers.b);
		AccessModifiers.m2();
		
		System.out.println(AccessModifiers.c);
		AccessModifiers.m3();
		
		System.out.println(AccessModifiers.d);
		AccessModifiers.m4();
	}
}
