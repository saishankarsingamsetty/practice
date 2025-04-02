package project;

public class Inventory {
	double totalsales;
	Product[] products=new Product[100];
	int insertPosition=0;

	Inventory(){
		for (int i = 0; i < 100; i++) {
            int id = i + 1;
            String name = "Product" + id;
            double price =Math.round((Math.random() * 100 * 100))/100.0; 
            int quantity = (int) (Math.random() * 50) + 1;
            products[i] = new Product(id, name, price, quantity);
            insertPosition++;
        }
	}
	
	//autoGrow
	public void autoGrow() {
		Product[] prods=new Product[products.length*2];
		for(int i=0;i<products.length;i++) {
			prods[i]=products[i];
		}
		products=prods;
	}
	
	//add product
	public void addProduct(Product p) throws Exception{
		if(searchProductById(p)!=null) {
			throw new Exception();
		}
		else {
			
			if(insertPosition==products.length) {
				autoGrow();
			}
			
			products[insertPosition++]=p;
			System.out.println("Product added successfully"); 
		}
	}
		
	
	
	//update product
	public void updateProduct(int productId,String updatedName,double updatedPrice,int updatedQuantity) {
		Product prod=searchProductById(productId);
		if(prod!=null) {
			prod.setName(updatedName);
			prod.setPrice(updatedPrice);
			prod.setQuantity(updatedQuantity);
			
			System.out.println("Product Updated Successfully");
		}
		else {
			System.out.println("Product not found");
		}
		
	}
	
	//delete products
	public void deleteProduct(int productId) {
		int index=-1;
		for(int i=0;i<insertPosition;i++) {
			if(products[i].getId()==productId) {
				index=i;
				break;
			}
		}
		
		if(index!=-1) {
			for(int i=index;i<insertPosition-1;i++) {
				products[i]=products[i+1];
			}
			products[--insertPosition]=null;
			System.out.println("product deleted successfully");
		}
		else {
			System.out.println("Product not found");
		}
	}
	
	//sell product
	public void sellProduct(int productId,int sellingQuantity) {
		Product prod=searchProductById(productId);
		if(prod!=null) {
			if(prod.getQuantity()>=sellingQuantity&&sellingQuantity>0) {
				prod.setQuantity(prod.getQuantity()-sellingQuantity);
				totalsales+=prod.getPrice()*sellingQuantity;
				System.out.println("item sale successfull");
			}
			else {
				System.out.println("please enter a valid selling quantity");
			}
		}
		else {
			System.out.println("Product not found");
		}
	}
	
	//display products
	public void dispalyProducts(){
		String s="[ ";
		for(int i=0;i<insertPosition;i++) {
			if(i==insertPosition-1) {
				s=s+products[i].toString();
				
			}
			else {
				s=s+products[i].toString()+" , ";
				
			}
		}
		s+=" \n]";
		
		System.out.println(s);
	}
	
	//sales report
	public void salesReport() {
		System.out.println("Todays sales is RS: "+totalsales);
	}
	
	//display a specific product
	public void displaySpecificProduct(int pid) {
		Product prod=searchProductById(pid);
		if(prod!=null) {
			System.out.println(prod);
		}
		else {
			System.out.println("Product not found");
		}
	}
	
	//search by id
	private Product searchProductById(Product p) {
		for(int i=0;i<insertPosition;i++) {
			if(p.equals(products[i])) {
				return p;
			}
		}
		return null;
	}
	
	private Product searchProductById(int id) {
		for(int i=0;i<insertPosition;i++) {
			if(products[i].getId()==id) {
				return products[i];
			}
		}
		return null;
	}
	

}
