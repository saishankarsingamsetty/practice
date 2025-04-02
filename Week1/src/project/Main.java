package project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Inventory inventory=new Inventory();
		Scanner scn=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("\n--Inventory Management--");
			System.out.println();
			System.out.println("Enter your option");
			System.out.println();
			System.out.println("1.Add Product to the Inventory");
			System.out.println("2.Display the Inventory");
			System.out.println("3.Update item details");
			System.out.println("4.Delete item from the Inventory");
			System.out.println("5.Sell a Product");
			System.out.println("6.Sales report");
			System.out.println("7.Display a specific product");
			System.out.println("8.Exit the system");
			int option=scn.nextInt();
			
			switch(option) {
			
			case 1:
				
				int pid=0;
				String pname="";
				double pprice=0;
				int pquantity=0;
				System.out.println("Enter product id");
				pid=scn.nextInt();
				System.out.println("Enter product name");
				pname=scn.next();
				System.out.println("Enter product price");
				pprice=scn.nextDouble();
				System.out.println("Enter product quantity");
				pquantity=scn.nextInt();
				
				Product p=new Product(pid,pname,pprice,pquantity);
				try {
					inventory.addProduct(p);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			
			case 2:
				
				inventory.dispalyProducts();
				break;
				
				
			case 3:
				pid=0;
				pname="";
				pprice=0;
				pquantity=0;
				System.out.println("Enter product id");
				pid=scn.nextInt();
				System.out.println("Enter updated product name");
				pname=scn.next();
				System.out.println("Enter updated product price");
				pprice=scn.nextDouble();
				System.out.println("Enter updated product quantity");
				pquantity=scn.nextInt();
				
				inventory.updateProduct(pid, pname, pprice, pquantity);
				
				break;
				
			case 4:
				System.out.println("Enter the Product id that you want to Delete");
				pid=scn.nextInt();
				inventory.deleteProduct(pid);
				break;
				
				
			case 5:
				System.out.println("Enter the ProductId you want to sell");
				pid=scn.nextInt();
				System.out.println("Enter the quantity you want to sell");
				pquantity=scn.nextInt();
				inventory.sellProduct(pid, pquantity);
				break;
				
			case 6:
				inventory.salesReport();
				break;
				
			case 7:
				System.out.println("Enter the productId you want to display");
				pid=scn.nextInt();
				inventory.displaySpecificProduct(pid);
				break;
				
			case 8:
				System.out.println("closing...");
				return;
				
			default :
				System.out.println("Enter a valid input");
				break;
				
			}
			
		}
	}
}
