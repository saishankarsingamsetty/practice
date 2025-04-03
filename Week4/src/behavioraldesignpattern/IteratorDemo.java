package behavioraldesignpattern;

public class IteratorDemo {
	public static void main(String[] args) {
		 NameCollection nameCollection = new NameCollection();
	        Iterator iterator = nameCollection.getIterator();

	        System.out.println("Iterating over the collection:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	}
}
