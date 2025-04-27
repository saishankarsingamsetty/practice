package com.StudentCourseManagementSystem;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable{

	private int id;
	private String name;
	private int age;
	private List<Course> registeredCources;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getRegisteredCources() {
		return registeredCources;
	}

	public void setRegisteredCources(List<Course> registeredCources) {
		this.registeredCources = registeredCources;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", registeredCources=" + registeredCources
				+ "]";
	}

	public Student(int id, String name, int age, List<Course> registeredCources) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.registeredCources = registeredCources;
	}
}
