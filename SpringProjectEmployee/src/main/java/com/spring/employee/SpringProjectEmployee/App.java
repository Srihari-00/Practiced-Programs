package com.spring.employee.SpringProjectEmployee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Employee e = (Employee)ctx.getBean("emp");
    	System.out.println(e);
    	
    	
    }
}
