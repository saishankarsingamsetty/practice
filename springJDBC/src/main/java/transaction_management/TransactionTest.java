package transaction_management;

//import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
		BankService service= cxt.getBean(BankService.class);
		
//		System.out.println(service.deposit(101, 500));
//		System.out.println(service.withdraw(101, 500));
		try {
			
			System.out.println(service.transfer(103, 101, 500));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

//		Arrays.stream(service.getClass().getSuperclass().getDeclaredFields()).forEach(System.out::println);
	}
}
