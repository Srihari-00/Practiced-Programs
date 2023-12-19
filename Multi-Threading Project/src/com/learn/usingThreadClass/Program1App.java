package com.learn.usingThreadClass;

public class Program1App {

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		Program1  p = new  Program1();
		p.setName("My Thread");
		p.setPriority(2);
		p.start();
	}

}
