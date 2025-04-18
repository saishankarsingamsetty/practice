package project;

import java.io.Serializable;

import java.util.Arrays;

public class Student implements Serializable {
	private int id;
	private String name;
	private int[] marks;
	private String grade;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
	
	
	Student(int id,String name,int[] marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
