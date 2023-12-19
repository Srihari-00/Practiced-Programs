package com.learn.employee;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	//Setting the data to the data members by using the constructor
	public void setData(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	//Getter methods for accessing the data outside the class
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}

}
