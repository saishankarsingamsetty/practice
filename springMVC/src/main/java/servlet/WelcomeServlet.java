package servlet;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeServlet {
	
	
	@RequestMapping("/home")
	public String  getView() {
		
		return "welcome";
		
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String  getView1() {
		
		return "index";
		
	}
	
//	@RequestMapping("/res")
	@RequestMapping(value = {"res1","res2","res3"})
	public String getResults(Map<String,Object> map) {
//		System.out.println(map.getClass());
		map.put("attr1","value 1" );
		map.put("attr2", "value 2");
		
		return "result";
//		return null; 
//		return "forward:index";
		
	}
}
