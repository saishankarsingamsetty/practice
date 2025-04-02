package structuraldesignpattern;

public abstract class AbstractRemote {
	Device device;
	
	AbstractRemote(Device device){
		this.device=device;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void increaseVolume();
}
