package com.learn.practice;

public class Student 
{
	private String name;
	private int age;
	private String gender;
	private int marks;
	
	public Student(String name, int age, String gender, int marks)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.marks=marks;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public int getMarks()
	{
		return marks;
	}

}
