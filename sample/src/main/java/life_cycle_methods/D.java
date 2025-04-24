package life_cycle_methods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class D implements InitializingBean, DisposableBean {

	
	public void init1() {
		System.out.println("inti() in XML");
	}
	
	public void destroy1() {
		System.out.println("destroy() in XML");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() in interface");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" init() in interface");
	}
	
	@PostConstruct
	public void init2() {
		System.out.println("init() in annotations");
	}
	
	@PreDestroy
	public void destroy2() {
		System.out.println("destroy() in annotations");
	}
}
