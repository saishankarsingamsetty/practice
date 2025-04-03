package structuraldesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeCircle implements Grafic {

	List<Grafic> list=new ArrayList<>();
	
	public void add(Grafic g) {
		list.add(g);
	}
	
	public void remove(Grafic g) {
		list.remove(g);
	}
	
	@Override
	public void draw() {
		for(Grafic grafic:list) {
			grafic.draw();
		}

	}

}
