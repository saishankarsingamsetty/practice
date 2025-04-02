package creationaldesignpattern;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {

	private BlockingQueue<Connection> pool	=new ArrayBlockingQueue<Connection>(5);
	
	public ConnectionPool() {
		System.out.println("constructor under connection poool");
		for(int i=0;i<5;i++) {
			pool.offer(new Connection());
		}
	}
	
	public Connection getConnection() {
		System.out.println("get connection");
		try {
			return pool.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void releaseConnection(Connection con) {
		try {
			pool.put(con);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("connection submitted");
	}
}
