package project;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		POS pos = context.getBean("POS",POS.class);
	
		while(true) {
			System.out.println("1> view pos balance");
			System.out.println("2> pay amount");
			System.out.println("3> exit");
			
			Scanner scn=new Scanner(System.in);
			int option = Integer.parseInt(scn.nextLine());
			
			switch(option) {
			case 1:
			{
				pos.viewPosBalance();
				break;
			}
			case 2:
			{
				System.out.println("enter amount to pay");
				double amount=Double.parseDouble(scn.nextLine());
				pos.payment(amount);
				break;
			}
			case 3:
			{
				scn.close();
				try {
					((Closeable) context).close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			}
			default :
			{
				System.out.println("enter a valid option");
			}
			
			}
		}
	}
}
