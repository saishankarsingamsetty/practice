package collections_utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(10,20,33,44,5,450,0,3,8);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("sorted collection");
		System.out.println(al+"\n");
		
		al=Arrays.asList(10,20,33,44,5,450,0,3,8,10,10);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println("reversed collection");
		System.out.println(al+"\n");
		
		al=Arrays.asList(10,20,33,44,5,450,0,3,8,10,10);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println("shuffled collection");
		System.out.println(al+"\n");
		
		System.out.println("Min element: "+Collections.min(al));
		
		System.out.println("Max element: "+Collections.max(al));
		
		System.out.println(Collections.frequency(al, 10));
		
		ArrayList<Integer> al1=new ArrayList(List.of(10,20,30));
		ArrayList<Integer> al2=new ArrayList(List.of(10));
		
		System.out.println(Collections.disjoint(al1, al2));
		
		al=Arrays.asList(10,20,33,44,5,450,0,3,8,10,10);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, 2222));
		
	}
}
