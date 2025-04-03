package structuraldesignpattern;

public class TV implements Device {
	int volume=5;
	@Override
	public void start() {
		System.out.println("tv started");
	}

	@Override
	public void stop() {
		System.out.println("tv spopped");
	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("TV volume is increased to "+this.volume);
	}

}
