package com.spring.laptop.exe1.SpringExample2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("config.xml");
        Laptop lap = (Laptop)cp.getBean("lp");
        System.out.println("Using Setter Injections");
        System.out.println(lap);
        Laptop l1 = (Laptop)cp.getBean("lp1");
        System.out.println("Using Constructor Injections");
        System.out.println(l1);
    }
}
