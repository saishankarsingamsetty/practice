package exceptionhandling;

public class TryCatchFinallyExecutionFlow {
	public static void main(String[] args)  {
		System.out.println(0);
		
		try {
			System.out.println(1);
			try{
				System.out.println(2);
			}
			catch(NullPointerException e) {
				System.out.println(3);
			}
			finally {
				System.out.println(4);
			}
			System.out.println(5);
		}
		catch(ArithmeticException e) {
			System.out.println(6);
		}
		finally {
			System.out.println(7);
		}
//		System.out.println(10/0);
		
		System.out.println(8);
		
		
		throw new NullPointerException();
		
//		System.out.println(9);//unreachable statement 
		
		
		
	}
}
