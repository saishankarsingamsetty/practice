package servlet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SuppressWarnings("all")
public class ValuesPassingController {

	@GetMapping("/print")
	public String printData(Map<String,Object> map) {
		map.put("name", "shankar");
		map.put("age", "22");
		
		
		List list = new ArrayList();
		list.add("abc");
		list.add(22);
		list.add("hello");
		
		map.put("list", list);
		
		//passing set collection
		Set set = new HashSet();
		set.add("set");
		set.add(123);
		set.add("set1");
		
		map.put("set",set);
		User user = new User();
		user.setId(1122);
		user.setAge(22);
		user.setName("hello");
		
		map.put("user", user);
		return "print";
	}
}
