package datatypes;

public class WrapperClasses {
	public static void main(String[] args) {
		Integer i1=1;
		Integer i2=1;
		System.out.println(i1==i2);
		
//		for(int i=0;i<150;i++) {
//			Integer i3=i;
//			Integer i4=i;
//			System.out.println(i+""+(i3==i4));
//		}
		//autoboxing
//		
//		Integer intval=2;
//		Integer intval2=Integer.valueOf(2);
		
		//auto unboxing
//		int i=i1;
//		int i3=i1.intValue();
//		
////		int i=Integer.valueOf(10);
//		Integer i=new Integer(19);
//		
//		int i1=i.intValue();
//		System.out.println(i);
//		
//		Boolean b1=new Boolean(true);
//		
//		boolean b2=b1.booleanValue();
		
//		Boolean b=Boolean.valueOf("");
		Boolean b=Boolean.valueOf("abc");
		
		System.out.println(b);
	}
}
