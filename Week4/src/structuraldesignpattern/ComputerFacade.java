package structuraldesignpattern;

public class ComputerFacade {
	private CPU cpu;
	private HardDisk hdd;
	private Memory ram;
	
	ComputerFacade(){
		this.cpu=new CPU();
		this.hdd=new HardDisk();
		this.ram=new Memory();
	}
	
	public void startComputer() {
		System.out.println("start computer");
		cpu.start();
		ram.loadMemory();
		hdd.loadData();
		cpu.execute();
		System.out.println("computer started successfully");
	}
	
	public void shutdowncomputer() {
		System.out.println("initiated shutdown");
		cpu.stop();
		System.out.println("shutdown successfull");
	}
}
