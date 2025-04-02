package structuraldesignpattern;

public class FlyWeightDemo {
	public static void main(String[] args) {
		
		Tree tree1=TreeFactory.getTree("oak","black","rough");
		tree1.display(10, 20);
		
		Tree tree2=TreeFactory.getTree("palm","red","smooth");
		tree2.display(10, 20);
		
		Tree tree3=TreeFactory.getTree("oak","black","rough");
		tree3.display(10, 20);
		
		Tree tree4=TreeFactory.getTree("palm","red","smooth");
		tree4.display(10, 20);
		
		Tree tree5=TreeFactory.getTree("oak","sandle","rough");
		tree5.display(10, 20);
		
	}
}
