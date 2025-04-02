package Operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int a=1;
		
		a++;
		++a;
		
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(a++);
		System.out.println(a);
		
		a=10;
		
		a--;
		--a;
		
		System.out.println(--a);
		System.out.println(a);
		
		System.out.println(a--);
		System.out.println(a);
		
		a=10;
		a=a++ + ++a;
		
		System.out.println(a);
		
		a=10;
		
		a=a++ + ++a + ++a - ++a;
		System.out.println(a);
		
		a=10;
		
		a=a-- + --a + ++a+ --a;
		System.out.println(a);
		
		a=++a+ +a++ + ++a;
		System.out.println(a);
		
		
	} 
}
