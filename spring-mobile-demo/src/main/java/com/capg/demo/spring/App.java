package com.capg.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Mobile samsung;
       
       ApplicationContext context=
    		   new AnnotationConfigApplicationContext(MobileConfigurations.class);
       samsung=(Mobile)context.getBean("mobile");

       samsung.browseInternet();
       samsung.makeACall();
       samsung.printAllContacts();
    }
}
