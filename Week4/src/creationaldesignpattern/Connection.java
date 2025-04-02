package creationaldesignpattern;

public class Connection {
	
	static int count=1; 
	int id;
	
	public Connection() {
		id=count++;
		
	}
	
	public void connect() {
		System.out.println("data base "+id+" is connected");
	}
	
	public void disconnect() {
		System.out.println("data base "+id+" is dis connected");
		
	}
	
}
