package behavioraldesignpattern;

public class CommadDemo {
	public static void main(String[] args) {
		Light light=new Light();
		Command turnOn=new LightOnCommand(light);
		Command turnOff=new LightOffCommand(light);
		
		RemoteControl remote=new RemoteControl();
		remote.setCommand(turnOn);
		remote.pressButton();
		
		remote.setCommand(turnOff);
		remote.pressButton();
	}
}
