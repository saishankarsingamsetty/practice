package Configurations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Store;

@RestController
public class RestControllerExample {

	@GetMapping("/list")
	public List<Integer> getlist() {
		ArrayList<Integer> list = new ArrayList<>(); 
			list.add(1);
			list.add(2);
			list.add(3);
			return list;
	}
	
	@GetMapping("/map")
	public Map<String,Object> map(){
		Map<String,Object> map = new HashMap<>();
		map.put("1", "hello");
		map.put("2",2);
		return map;
	}
	
	@GetMapping("/store")
	public Store store() {
		Store store = new Store();
		store.setName("store1");
		return store;
	}
	
	@GetMapping("/storelist")
	public List<Store> storelist() {
		
//		System.out.println(name);
		ArrayList<Store> list = new ArrayList<Store>();
		list.add(new Store());
		list.add(new Store());
		list.add(new Store());
		list.add(new Store());
		list.add(new Store());
		list.add(new Store());
		return list;
		
	}
	
	
	
}
