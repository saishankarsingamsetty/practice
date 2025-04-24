package life_cycle_methods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("b")
public class B implements InitializingBean, DisposableBean{
	B(){
		System.out.println("B class constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("B class destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("B class init()");
	}

}
