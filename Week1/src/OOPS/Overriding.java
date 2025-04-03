package OOPS;

public class Overriding {
	public static void main(String[] args) {
		Shape s= new Rectangle();
	}
}

class Shape{
	void area() {
		System.out.println("area of the shape");
	}
}

class Rectangle extends Shape{
	int length;
	int breath;
	public void area() {
		System.out.println(length*breath);
	}
}

class Circle extends Shape{
	int radius;
	public void area() {
		System.out.println(Math.PI*radius*radius);
	}
}
