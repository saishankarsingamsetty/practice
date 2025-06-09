package lookupinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookupInjection {

	@Autowired
	A a;
	
	@Lookup
	public abstract A lookupA();
	
	public void invokationMethod() {
		A a = lookupA();
		System.out.println(a);
	}
	
	
}
