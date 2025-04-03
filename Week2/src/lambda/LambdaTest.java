package lambda;

import java.util.ArrayList;

public class LambdaTest {
	public static void main(String[] args) {
		I1 i11=() -> {
			System.out.println("hello");
		};
		
		i11.m1();
		
		I1 i12=() -> System.out.println("hello");
		
		i12.m1();
		
		
		I2 i21=(int a)->{
			System.out.println(a);
		};
		i21.m1(0);
		
		I2 i22=(a)->{
			System.out.println(a);
		};
		i21.m1(0);
		
		I3 i31=()->{
			return 10;
		};
		System.out.println(i31.m1());
		
		I3 i32=()-> 120;
		System.out.println(i32.m1());
		
		
		I4 i41=(int a)->{
			return a+10;
		};
		System.out.println(i41.m1(10));
		
		
		I4 i42=(a)->a+10;
		System.out.println(i42.m1(12));
		
//		double d=100.2387409821374;
//		d=d*100;
//		d=Math.round(d);
//		d=d/100;
//		System.out.println(d);
		
		ArrayList<Integer> al=new ArrayList<>();
//		al.add(10);
//		al.add(2);
		al.add(44);
//		al.add(2);
		
		System.out.println(al.stream().reduce(1, (a,b)->a*b));
	}
}

@FunctionalInterface
interface I1{
	void m1();
}

@FunctionalInterface
interface I2{
	void m1(int a);
}

@FunctionalInterface
interface I3{
	int m1();
}

@FunctionalInterface
interface I4{
	int m1(int a);
}
