package com.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.jpa.findermethods.Emp;
import com.jpa.findermethods.EmpRepository;

@SpringBootApplication
//@EnableJpaAuditing
public class DemoApplication {

	@Autowired
    private EmpRepository empRepository;



	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(DemoApplication.class, args);
		
//		CustomerService service = cxt.getBean(CustomerService.class);
//		
//		//save method 
//		System.out.println(service.insertCustomer(new Customer(1001,"akash a","akash","akash@gmail.com")));
//		
//		
////		//exists by id method
////		System.out.println(service.isCustomerAvailable(1001));
////		
////		
////		//count method;
////		System.out.println(service.getCustomersCount());
////		
////		Iterable<Customer> customers = service.getAllCustomers();
////		
////		customers.forEach(System.out::println);
////		
////		
//		Iterable<Customer> customers1 = service.getCustomersByIds(List.of(100,102,102,1,1));
////		
////		int length = ((List) customers1).size();
////		System.out.println(length);
////		customers1.forEach(System.out::println);
//		
//		System.out.println(service.getCustomerById(1001).orElseThrow(()-> new RuntimeException("customer not found")));
		
		
		EmpRepository repo = cxt.getBean(EmpRepository.class);
		
//		repo.save(new Emp(0,"alen",22,100.0));
//		repo.save(new Emp(0,"ben",23,98.0));
//		repo.save(new Emp(0,"clob",23,44.0));
//		repo.save(new Emp(0,"den",26,20.0));
//		repo.save(new Emp(0,"alen",25,100.0));
		
//		repo.findByNameEquals("alen").forEach(System.out::println);
//		repo.findByAgeBetween(22, 25).forEach(System.out::println);
//		repo.findByNameLike("alen").forEach(System.out::println);
//		repo.findByNameContaining("a").forEach(System.out::println);;
//		repo.findByAgeLessThanEqualAndAgeGreaterThanEqual(26, 22).forEach(System.out::println);
//		List<ScalarInterfaceOfEmp> list = repo.findByName("alen");
//		for(ScalarInterfaceOfEmp sc : list) {
//			System.out.println(sc.getId()+"     "+sc.getName());
//		}
//		
////		repo.findAllEmp().forEach(System.out::println);
//		List<Object[]> data = repo.findAllEmp();
//		
//		data.forEach(a->{
//			for(Object b:a) {
//				System.out.print(b+" ");
//			}
//			System.out.println();
//		});
//		
//		Object[] names = repo.selectNames();
//		for(Object a:names) {
//			System.out.println(a);
//		}
		
//		for(Object o:names) {
//			Object[] obj = (Object[]) o;
//			System.out.println(Arrays.toString(obj));
//		}
		
		
//		repo.save(new Emp(2203,"alen",88,100.0));
		
		Optional<Emp> emp = repo.findById(2203);
//		
		if(emp.isPresent()) {
			Emp e = emp.get();
			System.out.println(e.getUpdateCount());
			e.setAge(8);;
			repo.save(e);
			System.out.println("saved");
		}
		else {
			System.out.println("employee not found");
		}
		
	}

}
