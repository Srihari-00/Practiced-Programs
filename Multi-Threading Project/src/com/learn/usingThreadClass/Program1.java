package com.learn.usingThreadClass;

public class Program1 extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
		
	}

}
