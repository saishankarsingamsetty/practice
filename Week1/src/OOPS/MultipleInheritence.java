package OOPS;

public class MultipleInheritence {
	public static void main(String[] args) {
		abc a=new abc();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
	}
	
	
}

interface i1{
	int a=10;
}

interface i2{
	int b=20;
}

class abc implements i1,i2{
	int c=30;
}
