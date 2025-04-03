package behavioraldesignpattern;

public class CSVDataFormatter extends DataProcessor{

	
	@Override
	public void readData() {
		System.out.println("reading csv data");
	}

	@Override
	public void processDataFormate() {
		System.out.println("processing the csv data");
	}

	@Override
	public void saveData() {
		System.out.println("saving the csv data");
	}

}
