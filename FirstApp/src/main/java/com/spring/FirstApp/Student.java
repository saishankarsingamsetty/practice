package com.spring.FirstApp;

import java.util.Date;

public class Student {

	private int a;
	private Date date;
	

	
	public Date getDate() {
		return date;
	}



	public void setDate(Date d) {
		this.date = d;
	}



	public void wishHello() {
		System.out.println("hello");
	}
	

	
	public void setA(int A) {
		this.a=A;
	}
	

	
	public int getA() {
		return this.a;
	}


//
//	public Student(int A, Date date) {
//		super();
//		this.a = A;
//		this.date = date;
//	}
}
