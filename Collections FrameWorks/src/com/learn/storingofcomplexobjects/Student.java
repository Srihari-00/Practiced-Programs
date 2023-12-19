package com.learn.storingofcomplexobjects;

public class Student {

	int rollNo;
	String name;
	float percentage;
	
	public Student(int roolNo, String name, float percentage)
	{
		this.rollNo=roolNo;
		this.name=name;
		this.percentage=percentage;
	}
	@Override
	public String toString()
	{
		return "Student[rollNo = "+rollNo+", Name = "+name+", Percentage = "+percentage+"]";
	}
}
