package OOPS;

public class HAS_A {
	public static void main(String[] args) {
		Library lib =new Library("abc library",new Book[]{new Book("abc","1"),new Book("def","2")} );
		
		System.out.println(lib);
	}
}

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

class Library{
	String name;
	Book[] b;
	
	public Library(String name, Book[] b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public String toString() {
		String s="";
		
		s+="{ name = "+name+" , books = {";
		
		for(int i=0;i<b.length;i++) {
			s+=" { "+b[i].title+" "+b[i].author+" }  ";
		}
		s=s.trim();
		s+=" }";

		return s;
	}
	
	
}
