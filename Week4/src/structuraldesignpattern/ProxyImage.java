package structuraldesignpattern;

public class ProxyImage implements Image {
	private RealImage image=null;
	@Override
	public void image() {
		if(image==null)
			image=new RealImage();
		
		image.image();
		System.out.println("proxy image");
	}

}
