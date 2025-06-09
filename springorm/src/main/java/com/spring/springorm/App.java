package com.spring.springorm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.springorm.dao.OrmPracDao;
import com.spring.springorm.entities.OrmPrac;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
        
        OrmPracDao dao = cxt.getBean(OrmPracDao.class);
        
        OrmPrac prac1 = new OrmPrac(11, "shankar1" , 1);
        OrmPrac prac2 = new OrmPrac(12, "shankar2" , 2);
        OrmPrac prac3 = new OrmPrac(3, "shankar3" , 3);
       
        dao.insert(prac1);
        dao.insert(prac2);
//        dao.insert(prac3);
//        dao.delete(prac2);
        
//        dao.update(prac2);
//        System.out.println(dao.display(0));
//        System.out.println(dao.display(1));
//        System.out.println(dao.display(4));
        
//        System.out.println(dao.displayAll());
        

    }
}
