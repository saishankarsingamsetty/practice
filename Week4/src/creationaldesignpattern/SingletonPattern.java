package creationaldesignpattern;

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton singleton1=Singleton.getInstance();
		System.out.println(singleton1);
		Singleton singleton2=Singleton.getInstance();
		System.out.println(singleton2);
		
	}
}

class Singleton{
	private static Singleton instance=null;
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
	private Singleton() {
		
	}
}
