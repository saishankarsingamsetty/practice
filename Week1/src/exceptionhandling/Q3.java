package exceptionhandling;

public class Q3 {
	public static void main(String[] args) {
		method(new Object());
	}
	
	static void method(Object obj) {
		try {
			System.out.println(obj.toString());
		}
		catch(NullPointerException e) {
			System.out.println("parameter can't be a null");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
