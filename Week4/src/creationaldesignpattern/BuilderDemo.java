package creationaldesignpattern;

public class BuilderDemo {
	public static void main(String[] args) {
		User user=new User.UserBuilder()
				.setName("hello")
				.setAge(20)
				.setEmail("abc.email.com")
				.setAddress("mars")
				.Build();
		
		System.out.println(user);
	}
}
