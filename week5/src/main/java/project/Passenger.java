package project;

public class Passenger {

	int id;
	String name;
	String email;
	long number;
	String pwd;
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", pwd=" + pwd
				+ "]";
	}
	
	public Passenger(String name, String email, long number, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.pwd = pwd;
	}
	
	
	public Passenger(int id, String name, String email, long number, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.pwd = pwd;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
