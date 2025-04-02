package structuraldesignpattern;

public class FacadeDemo {
	public static void main(String[] args) {
		ComputerFacade computer=new ComputerFacade();
		computer.startComputer();
		System.out.println("\n");	
		computer.shutdowncomputer();
	}
}
