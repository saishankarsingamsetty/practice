package com.service;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public float add(float a,float b) {
    	
    	if(a==0&&b==0) {
    		throw new IllegalArgumentException();
    	}
    	
//    	throw new RuntimeException();
    	
		return a+b;
	}
    
    
    public int sum() {
//    	try {
//    		Thread.sleep(2000);
//    	}
//    	catch(Exception e) {
//    		e.printStackTrace();
//    	}
    	return 0;
    }
    
    public int plusOne(int n) {
    	return n+1;
    }
    
    
}
