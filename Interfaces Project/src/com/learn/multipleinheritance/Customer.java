package com.learn.multipleinheritance;

public class Customer implements Food, Shake
{
	public void eat()
	{
		System.out.println("Customer is eating");
	}
	
	public void drink()
	
	{
		System.out.println("Customer is drinking");
	}

}
