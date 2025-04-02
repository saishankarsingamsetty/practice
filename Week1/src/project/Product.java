package project;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(int id,String name,double price,int quantity) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		String s="\n{ " ;
		s+="Id = "+id+" Name = "+name+" Price = "+price+" Quantity = "+quantity;
		s+=" }";
		return s;
	}
	
	@Override
	public boolean equals(Object p)
	{
		Product product=(Product)p;
		return this.id==product.getId()&&this.name.equals(product.getName())&&this.price==product.getPrice()&&this.quantity==product.getQuantity();
	}
	
}
