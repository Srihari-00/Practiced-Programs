package com.learn.studentclass;

public class Student 
{
	//Providing the security to data members of the class by using Private
	private int rollNo;
	private String name;
	private int age;
	private float percentage;
	//setter method for controlled access
	public void setData(int rollNo, String name, int age, float percentage)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	//getter method for controlled access
	public int getrollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public float getPercentage()
	{
		return percentage;
	}

}
