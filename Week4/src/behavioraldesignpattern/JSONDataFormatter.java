package behavioraldesignpattern;

public class JSONDataFormatter extends DataProcessor{

	@Override
	void readData() {
		System.out.println("reading json data ");
	}

	@Override
	void processDataFormate() {
		System.out.println("processing json data");
	}

	@Override
	void saveData() {
		System.out.println("saving json data");
	}

}
