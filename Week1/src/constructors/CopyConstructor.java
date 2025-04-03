package constructors;

public class CopyConstructor {
	
	public static void main(String[] args) {
		var v=new vehicle(10,new StringBuilder("20"));
		System.out.println(v);
		
		vehicle v1=new vehicle(v);
		System.out.println(v1);
		v.speed.delete(0, v.speed.length());
		v.speed.append("2020");
		System.out.println();
		System.out.println(v);
		System.out.println(v1);
	}
	
}

class vehicle{
	int gear;
	StringBuilder speed;
	
	vehicle(int gear, StringBuilder speed){
		this.gear=gear;
		this.speed=speed;
	}
	
	vehicle(vehicle v){
		this.gear=v.gear;
		this.speed=v.speed;
	}
	
	public String toString() {
		String s="";
		s+="gear = "+ gear;
		s+=" speed = "+speed;
		
		return s;
	}
}
