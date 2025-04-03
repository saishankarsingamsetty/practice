package creationaldesignpattern;

public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s=new Student();
		Student k=s.clone();
		Student t=k.clone();
		
		System.out.println(s);
		System.out.println(k);
		System.out.println(t.toString());
	}
}
