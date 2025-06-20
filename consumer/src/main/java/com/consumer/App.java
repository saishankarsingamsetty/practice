package com.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       Example example = context.getBean(Example.class);
       example.restExample();
       
//       example.printPet();
//       example.pathVariableExample();
//       example.usingPostMappingRegisteringPet();
       example.gettingListOfPetObjects();
    }
}
