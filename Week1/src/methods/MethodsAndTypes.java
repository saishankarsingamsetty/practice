package methods;

import java.util.Arrays;

public class MethodsAndTypes {
	public static void main(String[] args) {
		Methods.staticMethod();
		
		Methods m=new Methods();
		m.nonStaticMethod();
		
		Methods.noReturnTypeMethod();
		System.out.println(Methods.intReturntypeMethod());
		
		Methods.noParamMethod();
		Methods.intParammethod(10);
		
		m.move();
		m.finalMethod();
		
		m.synchronizedMethod();
		
		m.varArgMethod(10,20,30,40,50,600);
	}
}

class Methods extends Car{
	static void staticMethod() {
		System.out.println("static method");
	}
	
	void nonStaticMethod() {
		System.out.println("non staic method");
	}
	
	static void noReturnTypeMethod() {
		System.out.println("no return type method");
	}
	
	static int intReturntypeMethod() {
		System.out.println("int return type method");
		return 10;
	}
	
	static void noParamMethod() {
		System.out.println("no paramerterized method");
	}
	
	static void intParammethod(int a) {
		System.out.println("int param method");
	}
	
	public void move() {
		System.out.println("abstract method impl");
	}
	
//	void finalMethod() {
//		System.out.println("final method");
//	}
	
	synchronized void synchronizedMethod() {
		System.out.println("synchronized method");
	}
	
	void varArgMethod(int... i) {
		System.out.println("var arg method ");
		System.out.println(Arrays.toString(i));
	}
	
}

abstract class Car{
	abstract void move();
	
	final void finalMethod() {
		System.out.println("final method");
	}
}
