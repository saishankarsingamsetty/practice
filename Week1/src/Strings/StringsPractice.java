package Strings;

import java.util.Arrays;

public class StringsPractice {
	public static void main(String[] args) {
		
		String s="";
		
		String s1="abc";

		String s2=new String("abc");
		String s3=new String("abc");
		
		String s4=new String("hello");
		
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s==s2);
		System.out.println(s2==s3);
		
		
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s3));
		
		System.out.println(s.equals(s4));
		System.out.println(s3.equals(s4));
		
		
		
		//string methods.
		s="";
		System.out.println(s.isEmpty());
		s=" ";
		System.out.println(s.isEmpty());
		
		System.out.println(s.isBlank());
		
		s="";
		System.out.println(s.length());
		s=" ";
		System.out.println(s.length());
		s="abc";
		System.out.println(s.length());;
		
		s="abc";
		System.out.println(s);
		System.out.println(s.toString());
		
		s="a";
		s1="A";
		System.out.println(s.compareTo(s1));;
		System.out.println(s1.compareTo(s));
		System.out.println(s1.compareTo("A"));;
		
		System.out.println(s1.compareToIgnoreCase(s));
		s="b";
		System.out.println(s1.compareToIgnoreCase(s));
		s="B";
		System.out.println(s1.compareToIgnoreCase(s));
		
		s="hello world";
		System.out.println(s.startsWith("hello"));
		System.out.println(s.startsWith("abc"));
		
		s="hello world";
		System.out.println(s.endsWith("world"));
		System.out.println(s.endsWith("abc"));
		
		s="abcabc";
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf("bc"));
		System.out.println(s.indexOf('d'));
		
		System.out.println(s.indexOf('a',3));
		System.out.println(s.indexOf("bc",3));
		System.out.println(s.indexOf('d',3));
		
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf("bc"));
		System.out.println(s.lastIndexOf("bcd"));
		
		System.out.println(s.lastIndexOf('a',3));
		System.out.println(s.lastIndexOf("bc",3));
		System.out.println(s.lastIndexOf("bcd",3));
		
		
		s="java programming language";
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,15));
//		System.out.println(s.substring(5,150));
		System.out.println(s.substring(5,5));
//		System.out.println(s.substring(6,5));
//		System.out.println(s.substring(-1));
		
		s="abc";
		System.out.println(s);
		s=s+"de";
		System.out.println(s);
		s=s.concat("de");
		System.out.println(s);

		s="abc";
		System.out.println(s.toUpperCase());
		s="ABC";
		
		s="abca";
		System.out.println(s.replace('a', 'd'));
		System.out.println(s.replace("ab", "d"));
		
		s="abca";

		System.out.println(s.replaceAll("ab", "d"));
		
		s="abca";
		
		System.out.println(s.replaceFirst("ab", "d"));
		
		s=" abcd ";
		System.out.println(s);
		System.out.println(s.length());;
		s=s.trim();
		System.out.println(s.length());
		System.out.println(s);
		
		s="a b c d e";
		String[] a=s.split(" ");
		System.out.println(Arrays.toString(a));
		
		s="a b c d e";
		a=s.split("");
		System.out.println(Arrays.toString(a));
		
		
		
	}
}
