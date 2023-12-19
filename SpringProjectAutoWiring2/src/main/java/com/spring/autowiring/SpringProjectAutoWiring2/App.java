package com.spring.autowiring.SpringProjectAutoWiring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Car c1 = (Car)ctx.getBean("car");
        System.out.println("Using Annotations ");
        System.out.println(c1);
        
       
        
    }
}
