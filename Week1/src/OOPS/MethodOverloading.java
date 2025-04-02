package OOPS;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.add(1, 1));
		System.out.println(m.add("hii", "hello"));
		System.out.println(m.add(1.0, 1.0));
		System.out.println(m.add(10, 20, 30));
		
		System.out.println(m.add(10.f, 10.f));
		System.out.println(m.add('a', 'a'));
		System.out.println(m.add('a', 10));
		System.out.println(m.add('a', 10.0f));
		System.out.println(m.add('a', 10.0));
	}
	
	public int add(int a,int b) {
		System.out.println("int int");
		return a+b;
	}
	
	public String add(String a,String b) {
		System.out.println("String String");
		return a+b;
	}
	
	public double add(double a,double b) {
		System.out.println("double double");
		return a+b;
	}
	
	public int add(int a,int b, int c) {
		System.out.println("int int int");
		return a+b+c;
	}
	
	public double add(double a,int b) {
		System.out.println("double int");
		return a+b;
	}
	
	public char add(char ch1, char ch2) {
		System.out.println("char char");
		return (char)(ch1+ch2);
	}
	
	public float add(float ch1, float ch2) {
		System.out.println("float float");
		return(ch1+ch2);
	}
}
