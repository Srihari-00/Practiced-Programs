package com.spring.autowiring.SpringProjectAutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        /*Mobile m1 = (Mobile)ctx.getBean("mob1");
        System.out.println(m1);
        Mobile m2 = (Mobile)ctx.getBean("mob");
        System.out.println(m2);
        */
        Person p1 = (Person)ctx.getBean("per");
        System.out.println(p1);
        
        ctx.close();
        
    }
}
