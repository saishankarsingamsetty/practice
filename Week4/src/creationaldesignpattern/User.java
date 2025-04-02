package creationaldesignpattern;

public class User {


	private String name;
	private int age;
	private String email;
	private String address;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	User(UserBuilder builder){
		this.name=builder.name;
		this.age=builder.age;
		this.email=builder.email;
		this.address=builder.address;
	}
	
	public static class UserBuilder{
		private String name;
		private int age;
		private String email;
		private String address;
		
		public UserBuilder setName(String name) {
			this.name =name;
			return this;
		}
		
		public UserBuilder setAge(int age) {
			this.age=age;
			return this;
		}
		
		public UserBuilder setEmail(String email) {
			this.email=email;
			return this;
		}
		
		public UserBuilder setAddress(String address) {
			this.address=address;
			return this;
		}
		
		public User Build() {
			return new User(this);
		}
	}
}
