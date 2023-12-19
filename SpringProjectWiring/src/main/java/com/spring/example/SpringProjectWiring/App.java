package com.spring.example.SpringProjectWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Trainer t1 = (Trainer)ctx.getBean("train1");
		System.out.println(t1);
		Trainer t2 = (Trainer)ctx.getBean("train2");
		System.out.println(t2);
		KodNestClasses kc = (KodNestClasses)ctx.getBean("kodclass");
		System.out.println(kc);
		ctx.close();
	}
}
