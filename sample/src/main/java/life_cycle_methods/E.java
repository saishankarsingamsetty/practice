package life_cycle_methods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("e")
public class E {
	
		
		@PostConstruct
		public void init() {
			System.out.println("E class init()");
		}
		
		@PreDestroy
		public void destroy() {
			System.out.println("E class destroy()");
		}
	}
