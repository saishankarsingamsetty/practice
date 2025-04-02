package Strings;

public class StringBufferPractice {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		System.out.println(sb);
	
		sb.append("hi");
		System.out.println(sb);
		
		sb.insert(0, "hello");
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}
