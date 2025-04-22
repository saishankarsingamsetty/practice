package com.spring.FirstApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        Student student1 = (Student)context.getBean("abc");
        System.out.println(student1);
        student1.wishHello();
        System.out.println(student1.getA());
        System.out.println(student1.getDate());
        
        //getting again
        Student student2 = (Student)context.getBean("abc");
        System.out.println(student2);
        
    }
}
