package structuraldesignpattern;

public class BasicRemote extends AbstractRemote{
	BasicRemote(Device device){
		super(device);
	}
	
	@Override
	public void turnOn() {
		System.out.println("basic remote control");
		device.start();
	}

	@Override
	public void turnOff() {
		System.out.println("basic remote control");
		device.stop();
	}

	@Override
	public void increaseVolume() {
		System.out.println("basic remote control");
		device.setVolume(20);
	}
	
}
