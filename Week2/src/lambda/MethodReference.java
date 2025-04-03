package lambda;

import java.util.ArrayList;

public class MethodReference {
	int a;
	MethodReference(){
		System.out.println("no param and return type");
		System.out.println(this);
	}
	
	MethodReference(int a){
		System.out.println("with param and return type");
	}
	
	public static void main(String[] args) {
		
		//static method reference
		I1 i11=MethodReference::staticMethod;
		i11.m1();
		
		
		I2 i22=MethodReference::staticMethod;
		i22.m1(10);
		
		I3 i33=MethodReference::staticMethod1;
		i33.m1();
		
		I4 i44=MethodReference::staticMethod1;
		i44.m1(20);
		
		//instance method reference
		MethodReference mr=new MethodReference();
		
		
		i11=mr::instanceMethod;
		i11.m1();
		
		i22=mr::instanceMethod;
		i22.m1(10);
		
		i33=mr::instanceMethod1;
		i33.m1();
		
		i44=mr::instanceMethod1;
		i44.m1(20);
		
		
		
		//constructor reference
		I1 i1=MethodReference::new;
		System.out.println("sajdflkjsadflkjdsalkfjdsalkfjsalkfjdsalkfjldsak");
		i1.m1();
		
		i22=MethodReference::new;
		i22.m1(100);
		
		I5 i5=MethodReference::new;
		System.out.println(i5.m1(10));
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("hello");
		al.add("World");
		
		al.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
	}
	
	public static void staticMethod() {
		System.out.println("static method reference");
	}
	
	public static int staticMethod1() {
		System.out.println("static method reference with return type");
		return 10;
	}
	
	public static void staticMethod(int a) {
		System.out.println("static method reference with parameters");
	}
	
	public static int staticMethod1(int a) {
		System.out.println("static method reference with parameters and return type");
		return 10;
	}
	
	public void instanceMethod() {
		System.out.println("instance method reference");
	}
	
	public int instanceMethod1() {
		System.out.println("instance method with return type");
		return 10;
	}
	
	public void instanceMethod(int a) {
		System.out.println("instance method reference with parameters");
	}
	
	public int instanceMethod1(int a) {
		System.out.println("instance method reference with parameters and return  type");
		return 10;
	}
}


//@FunctionalInterface
//interface I1{
//	void m1();
//}
//
//@FunctionalInterface
//interface I2{
//	void m1(int a);
//}
//
//@FunctionalInterface
//interface I3{
//	int m1();
//}
//
//@FunctionalInterface
//interface I4{
//	int m1(int a);
//}

@FunctionalInterface
interface I5{
	MethodReference m1(int i);
}