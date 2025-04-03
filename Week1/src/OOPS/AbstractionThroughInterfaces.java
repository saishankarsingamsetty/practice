package OOPS;

public class AbstractionThroughInterfaces {
	public static void main(String[] args) {
		Vehicle v=new Bus();
		v.start();
		v.stop();
	}
}

interface Vehicle{
	void start();
	void stop();
}

class Bus implements Vehicle{
	public void start() {
		System.out.println("Bus Started");
	}
	
	public void stop(){
		System.out.println("Bus Stopped");
	}
}
