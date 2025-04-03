package structuraldesignpattern;

public class BridgeDemo {

	public static void main(String[] args) {
		Device tv=new TV();
		Device radio=new Radio();
		
		AbstractRemote basic=new BasicRemote(tv);
		AbstractRemote adv=new AdvancedRemoteControl(tv);
		
		basic.turnOn();
		basic.increaseVolume();
		basic.turnOff();
		
		System.out.println();
		basic=new BasicRemote(radio);
		basic.turnOn();
		basic.increaseVolume();
		basic.turnOff();
		
		System.out.println();
		adv.turnOn();
		adv.increaseVolume();
		adv.turnOff();
		
		System.out.println();
		adv=new AdvancedRemoteControl(radio);
		adv.turnOn();
		adv.increaseVolume();
		adv.turnOff();
		
	}
}
