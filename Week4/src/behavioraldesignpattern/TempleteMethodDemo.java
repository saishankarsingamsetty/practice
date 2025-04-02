package behavioraldesignpattern;

public class TempleteMethodDemo {

	public static void main(String[] args) {
		DataProcessor processor=new CSVDataFormatter();
		processor.processData();
		
		System.out.println();
		
		processor=new JSONDataFormatter();
		processor.processData();
	}
}
