package OOPS;

import java.lang.reflect.InvocationTargetException;

public class ClassAndObjectsExample {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException {
		Bicycle b1=new Bicycle();
		b1.gear=2;
		b1.speed=3;
		
		Bicycle b2=new Bicycle();
		b2.gear=8;
		b2.speed=200;
		
		b1.printStates();
		System.out.println();
		b2.printStates();
		
		b1.changeGear(3);
		b1.speedUp(30);
		
		System.out.println();
		b1.printStates();
		
		System.out.println();
		b2.printStates();
		
		Class clazz=Class.forName("OOPS.Bicycle");
		Object bicycleobj=clazz.newInstance();
		
		Bicycle b33=(Bicycle)bicycleobj;
		b33.printStates();
		
		
		b33=(Bicycle) Bicycle.class.getDeclaredConstructors()[0].newInstance();
		
		b33.printStates();
		
		Bicycle b44=(Bicycle) b1.clone();
		b44.printStates();
		b44.gear=9999999;
		
		b44.printStates();
		b1.printStates();
		
		
	}
}

class Bicycle implements Cloneable{
	
	Bicycle(){}
	int gear=0;
	int speed = 0;
	
	void speedUp(int inc) {
		speed+=inc;
	}
	
	void applyBreaks(int dec) {
		speed-=dec;
	}
	
	void changeGear(int change) {
		gear=change;
	}
	
	void printStates() {
		System.out.println("Gear: "+gear);
		System.out.println("Speed: "+speed);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
