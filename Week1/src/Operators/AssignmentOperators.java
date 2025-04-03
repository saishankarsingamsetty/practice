package Operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a = 10;
        int b = 5;
        System.out.println(a + " " + b);

        a += b;
        System.out.println(a + " " + b);
        
        b+=a;
        System.out.println(a + " " + b);
        

        a -= b;
        System.out.println(a + " " + b);
        
        b-=a;
        System.out.println(a + " " + b);
        
        a *= b;
        System.out.println(a + " " + b);
        
        b*=a;
        System.out.println(a + " " + b);
        
        a /= b;
        System.out.println(a + " " + b);
        
        a=10;
        b/=a;
        System.out.println(a + " " + b);
        
        a %= b;
        System.out.println(a + " " + b);
        
        b %= a;
        System.out.println(a + " " + b);
        
        a = 10;
        a &= b;
        System.out.println(a + " " + b);
        
        b &= a;
        System.out.println(a + " " + b);
        
        a = 10;
        a |= b;
        System.out.println(a + " " + b);
        
        b |= a;
        System.out.println(a + " " + b);
        
        a = 10;
        a ^= b;
        System.out.println(a + " " + b);
        
        b ^= a;
        System.out.println(a + " " + b);
        
        a = 10;
        a <<= 2;
        b <<=2;
        System.out.println(a + " " + b);
        
        a >>= 2;
        b >>= 2;
        System.out.println(a + " " + b);
        
        a = -10;
        a >>>= 2;
        b>>>=2;
        System.out.println(a + " " + b);
        
	}
}
