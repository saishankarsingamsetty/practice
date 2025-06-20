package com.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       Example example = context.getBean(Example.class);
       example.restExample();
       
       example.printPet();
    }
}
