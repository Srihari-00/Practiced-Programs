package com.learn.comparableinterface;

public class Student1 implements Comparable
{
	int rollNo;
	String name;
	float percentage;
	@Override
	public int compareTo(Object o) 
	{
		if(this.rollNo > ((Student1)(o)).rollNo)
		{
			return 1;
		}
		else if(this.rollNo < ((Student1)(o)).rollNo)
		{
			return -1;
		}
		return 0;
	}
	public Student1(int rollNo, String name, float percentage) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	 @Override
	    public String toString() {
	        return "Roll No: " + rollNo + ", Name: " + name + ", Percentage: " + percentage;
	    }


}
