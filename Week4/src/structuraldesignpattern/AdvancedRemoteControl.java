package structuraldesignpattern;

public class AdvancedRemoteControl extends AbstractRemote {

	AdvancedRemoteControl(Device device){
		super(device);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Advanced remote control");
		device.start();
	}

	@Override
	public void turnOff() {
		System.out.println("Advanced remote control");
		device.stop();
	}

	@Override
	public void increaseVolume() {
		System.out.println("Advanced remote control");
		device.setVolume(50);
	}

	
}
