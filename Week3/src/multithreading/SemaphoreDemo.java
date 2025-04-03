package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	public static void main(String[] args) {
		SharedResourse resourse=new SharedResourse();
		
		System.out.println("main start");
		for(int i=0;i<10;i++) {
			new Thread(()->{resourse.useResourse();}).start();
		}
		
		System.out.println("main end");
	}
}

class SharedResourse{
	public static final Semaphore semaphore=new Semaphore(2);
	
	public void useResourse() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+" is consuming the resource" );
			Thread.sleep(1000);;
			System.out.println(Thread.currentThread().getName()+"is completed");
		}
		catch(Exception e) {
			
		}
		finally {
			semaphore.release();
		}
	}
}
