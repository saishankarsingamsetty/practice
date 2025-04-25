package lookupinjection;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookupInjection {

	@Lookup
	public abstract A lookupA();
	
	public void invokationMethod() {
		A a = lookupA();
		System.out.println(a);
	}
	
	
}
