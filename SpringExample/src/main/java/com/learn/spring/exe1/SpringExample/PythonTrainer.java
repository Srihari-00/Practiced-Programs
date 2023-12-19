package com.learn.spring.exe1.SpringExample;

public class PythonTrainer implements Trainer 
{
	@Override
	public void teach() 
	{
		System.out.println("Python Trainer is teaching the Java programming Language");
	}
	
	@Override
	public void takeAttendence()
	{
		System.out.println("Python Trainer is taking the attendence");
	}

}
