package multithreading;

public class Test1 extends Thread{
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main thread "+i);
			
		}
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("thread "+i);
		}
	}
}
