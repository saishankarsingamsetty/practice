package methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankMethodReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("replaced method");
		int p=(Integer)args[0];
		int t=(Integer)args[1];
		int r=(Integer)args[2];
		
		return ((p*t*r)/100.0)+1000;
	}

}
