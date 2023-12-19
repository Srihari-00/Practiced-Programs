package com.learn.spring.exe1.SpringExample;

public class JavaTrainer implements Trainer 
{
	@Override
	public void teach() 
	{
		System.out.println("Java Trainer is teaching the Java programming Language");
	}
	
	@Override
	public void takeAttendence()
	{
		System.out.println("Java Trainer is taking the attendence");
	}
	
	public void end()
	{
		System.out.println("Java session is ended.....");
	}

}
