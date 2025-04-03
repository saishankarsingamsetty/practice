package multithreading; 

public class Test3 {
	public static void main(String[] args) {
		MyThread1 th1=new MyThread1();
//		MyThread1 th2=new MyThread1();
		
		th1.start();
//		th2.start();
		try {
//			th2.join();
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+(i+1));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("end of the main");
		System.out.println("end of the main");
		
	}
}

class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+(i+1));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("hello");
				System.out.println("hello");
			}
		}
	}
}

