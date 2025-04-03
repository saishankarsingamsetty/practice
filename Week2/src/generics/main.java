package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main<T> {
	
	T t;
	    
	main(T t){
		this.t=(T)t;
	}
	
	public <T> void print(T t) {
		System.out.println(t.toString());
	}
	
	public static void main(String[] args) {
//		Int<Integer> i=new Int<>();
//		i.set(10);
//		System.out.println(i.get());
		int i=new Integer(0);
//		
//		main m=new main();
//		m.print(i);
		
		m1(List.of(10,20,30,40));
		m1(List.of(10.0,20,0,30.50));
		
//		m1(List.of("a","b","c"));
		
		m2(List.of(new Object(),new Object()));
		m3(10,20,30,40,50);
		m3('a','b','c','d');
		System.out.println();
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(10);
		
//		new main<Integer>().m4(al1,10);
	}
	
	public static <T> void m3(T... n) {
		System.out.println(n[0].getClass().getSimpleName());
		System.out.println(n[0].getClass().getCanonicalName());
		System.out.println(n[0].getClass().getName());
	}
	
	public static void m1(List<? extends Number> list) {
		System.out.println(list);
	}
	
	public static void m2(List<? super Integer> list) {
		System.out.println(list);
	}
	
//	public  void m4(List<T> list) {
//		list.add((T) "hello");
//		System.out.println(list);
//	}
	
//	public  void m4(List<? extends T> list ,T t) {
//		list.add(t);
//		System.out.println(list);
//	}
}
