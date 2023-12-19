package com.learn.thismethod;

public class JavaTeacher extends Teacher
{
	String className;
	
	public JavaTeacher()
	{
		super("KodNest");
		System.out.println("JavaTeacher's 0-para Constructor");
	}
	
	public JavaTeacher(String className)
	{
		this();
		this.className=className;
		System.out.println("JavaTeacher's 1-para Constructor");
	}
	
	void display()
	{
		System.out.println("Class Name : "+className);
		System.out.println("College Name : "+collegeName);
	}

}
