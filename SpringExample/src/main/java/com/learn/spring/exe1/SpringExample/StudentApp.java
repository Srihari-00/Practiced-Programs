package com.learn.spring.exe1.SpringExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student)cpx.getBean("st");
		System.out.println(s);
	}

}
