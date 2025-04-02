package arraylist;

import java.util.HashSet;

public class HashSetPractice {
	public static void main(String[] args) {
		HashSet<Test> set=new HashSet<>();
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		System.out.println(set);
	}
}

class Test{
	int a=10;
	@Override
	public int hashCode() {
		return 1;
	}
}
