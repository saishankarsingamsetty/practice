package creationaldesignpattern;

public class ObjectPoolDemo {

	public static void main(String[] args) {
		ConnectionPool pool = new ConnectionPool();
		
		System.out.println("ObjectPoolDemo.main()");
		Connection con= pool.getConnection();
		System.out.println(con);
		con.connect();
		con.disconnect();
		
		pool.releaseConnection(con);
		
		con=pool.getConnection();
		Connection con1=pool.getConnection();
		Connection con2=pool.getConnection();
		Connection con3=pool.getConnection();
		Connection con4=pool.getConnection();
		pool.releaseConnection(con4);
		Connection con5=pool.getConnection();
//		pool.releaseConnection(con4);
//		pool.releaseConnection(con5);
//		Connection con6=pool.getConnection();
////		System.out.println(con6);
//		
//		pool.releaseConnection(con1);
		
		
	}
}
