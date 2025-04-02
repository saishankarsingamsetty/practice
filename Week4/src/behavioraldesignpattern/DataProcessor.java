package behavioraldesignpattern;

public abstract class DataProcessor {

	public void processData() {
		readData();
		processDataFormate();
		saveData();
	}
	
	abstract void readData();
	abstract void processDataFormate();
	abstract void saveData();
	
}
