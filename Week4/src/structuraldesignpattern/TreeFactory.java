package structuraldesignpattern;

import java.util.HashMap;

public class TreeFactory {
	private static HashMap<String,Tree> map=new HashMap<>();
	
	public static Tree getTree(String type,String color,String texture) {
		String name=type+" "+color+" "+texture;
		Tree tree=map.get(name);
		
		if(tree==null) {
			TreeType treetype=new TreeType(type,color,texture);
			map.put(name,treetype);
		}
		
		return map.get(name);
	}
}
