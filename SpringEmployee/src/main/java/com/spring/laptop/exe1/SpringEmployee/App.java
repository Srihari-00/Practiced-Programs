package com.spring.laptop.exe1.SpringEmployee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee1 emp1 = (Employee1)ctx.getBean("e1");
        System.out.println("Using the Constructor Injection");
        System.out.println(emp1);
        Employee2 emp2 = (Employee2)ctx.getBean("e2");
        System.out.println("Using the Setter Injection");
        System.out.println(emp2);
    }
}
