package com.learn.spring.exe1.SpringExample;

public class DBTrainer implements Trainer 
{
	@Override
	public void teach() 
	{
		System.out.println("DataBase Trainer is teaching the Java programming Language");
	}
	
	@Override
	public void takeAttendence()
	{
		System.out.println("DataBase Trainer is taking the attendence");
	}
}
