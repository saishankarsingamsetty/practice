package customcollections;

public class CustomArrayListTest {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
//		list.addElement(123);
//		list.addElement("hello");
//		list.addElement(10.0);
//		list.addElement("java");
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(5);
//		list.addElement(6);
//		list.addElement(7);
//		list.addElement(8);
//		list.addElement(9);
//		list.addElement(10);
		
//		System.out.println(list.size());
//		System.out.println(list);
//		
//		System.out.println(list.getElementAt(0));
//		System.out.println(list.getElementAt(5));
//		
//		System.out.println(list);
//		System.out.println(list.setElementAt(0, "abc"));
//		System.out.println(list);
//		
//		list.remove(10);
//		System.out.println(list);
//		System.out.println();
////		list.remove(22);
//		
//		System.out.println(list);
//		list.removeAtIndex(12);
//		System.out.println(list);
//		
//		System.out.println(list.size());
		
		
		System.out.println(list);
		list.removeAtIndex(4);
		System.out.println(list);
	}
}
