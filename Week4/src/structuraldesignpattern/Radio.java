package structuraldesignpattern;

public class Radio implements Device {
	int volume=5;
	@Override
	public void start() {
		System.out.println("Radio is started");
	}

	@Override
	public void stop() {
		System.out.println("Radio is stopped");
	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("Radio volume is increased to "+this.volume);
	}

}
