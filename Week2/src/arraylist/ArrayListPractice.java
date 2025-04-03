package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class ArrayListPractice {
	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList<>();
////		al.add(10);
////		System.out.println(al);
////		al.remove(Integer.valueOf("10"));
////		System.out.println(al);
//		
//		al.addAll(Arrays.asList(101,202,30,40));
//		
////		System.out.println(al);
////		
////		Iterator<Integer> itr=al.iterator();
////		
////		while(itr.hasNext()) {
////			int i=itr.next();
////			System.out.println(i);
////			if(i%2==0) {
////				itr.remove();
////			}
////		}
//		
//		System.out.println(al);
//		ListIterator<Integer> li=al.listIterator();
//		li.add(10);
//		System.out.println(al);
////		System.out.println(al);
////		while(li.hasNext()) {
////			li.next();
////		}
////		li.add(100000);;
//		li.next();
//		li.add(100000);
//		System.out.println(al);
		
		
		ArrayList al=new ArrayList();
		System.out.println(al.isEmpty());
		
		al.add(1);
		al.add('a');
		al.add("hello");
		al.add(new StringBuilder("hi"));
		al.add(10.0);
		al.add(null);
		System.out.println(al.isEmpty());
		
//		Consumer<T> c;
//		System.out.println(al);
//		al.forEach(System.out::println);
		
//		System.out.println(al.get(5));
//		al.remove(Integer.valueOf(1));
//		System.out.println(al);
//		al.remove(0);
//		System.out.println(al);
//		al.set(3, "hello");
//		System.out.println(al);
//		
//		System.out.println(al.size());
//		
//		System.out.println(al.contains("hello"));
		
//		String s=(String)al.get(2);
//		System.out.println(s);
//
//		System.out.println("\n"+al);
//		Collections.reverse(al);
//		System.out.println(al);
		
//		Collections.sort(al);
//		System.out.println(al);
		
	}
}
