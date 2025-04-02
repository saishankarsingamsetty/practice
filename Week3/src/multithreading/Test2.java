package multithreading;

public class Test2 {
	public static void main(String[] args) {
		MyRunnable runnable =new MyRunnable();
		Thread t1=new Thread(runnable);
		t1.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("main "+i);
		}
	}
}

class MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("my runnable "+ i);
		}
	}
}
