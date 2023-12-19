package com.learn.comparatorinterface;

import java.util.Comparator;

import com.learn.comparableinterface.Student1;

public class Student implements Comparator<Student>
{
	int rollNo;
	String name;
	float percentage;
	
	public Student(int rollNo, String name, float percentage) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	 @Override
	    public String toString() {
	        return "Roll No: " + rollNo + ", Name: " + name + ", Percentage: " + percentage;
	    }
	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.rollNo > o2.rollNo)
		{
			return 1;
		}
		else if(o1.rollNo < o2.rollNo )
		{
			return -1;
		}
		
		return 0;
	}


}
