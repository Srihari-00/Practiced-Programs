package com.learn.thismethod;

public class Teacher 
{
	String collegeName;
	
	public Teacher()
	{
		System.out.println("Teacher's 0-para Constructor");
	}
	
	public Teacher(String collegeName)
	{
		this();
		this.collegeName=collegeName;
		System.out.println("Teacher's 1-para Constructor");
	}
}