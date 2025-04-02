package structuraldesignpattern;

public class TreeType implements Tree {
	private String type;
	private String color;
	private String texture;
	
	TreeType(String type,String color,String texture){
		this.type=type;
		this.color=color;
		this.texture=texture;
	}
	
	@Override
	public void display(int x, int y) {
		System.out.println("tree is displaying at position x = "+x+" y = "+y+" "+ type+" "+color+" "+texture+"     "+this.toString());
	}

}
