package structuraldesignpattern;

public class CompositeDemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		CompositeCircle g=new CompositeCircle();
		CompositeCircle k=new CompositeCircle();
		g.add(c);
		k.add(c);
		g.add(k);
		c.draw();
		g.draw();
	}
}
