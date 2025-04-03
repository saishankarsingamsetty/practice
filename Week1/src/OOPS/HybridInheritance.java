package OOPS;

public class HybridInheritance extends Animal implements Mammel,Bird {
	public static void main(String[] args) {
		HybridInheritance hi=new HybridInheritance();
		System.out.println(hi.a);
		System.out.println(hi.b);;
		System.out.println(hi.m);
		
	}
}

class Animal{
	int a=10;
}

interface Mammel{
	int m=10;
}

interface Bird{
	int b=10;
}
