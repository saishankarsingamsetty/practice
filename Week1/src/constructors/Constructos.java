package constructors;

public class Constructos extends abc {
	
	public Constructos() {
		this(10);
		System.out.println("default constructor");
	}
	
	public Constructos(int a) {
		System.out.println("int parameterized constructor");
	}
	
	public static void main(String[] args) {
		new Constructos();
		System.out.println();
		new Constructos(10);
	}
}


class abc{
	public abc(){
		this(10);
		System.out.println("super class no param constructor");
	}
	
	public abc(int a) {
		System.out.println("super class int param constructor");
	}
}
