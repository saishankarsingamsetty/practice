package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		Future<String> future =executor.submit(()->{
			for(int i=0;i<=10000;i++) {
				
				System.out.println(i);
				throw new ArithmeticException();
			}
			}	, "completed successfully");
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	