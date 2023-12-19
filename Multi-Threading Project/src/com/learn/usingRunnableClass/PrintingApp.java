package com.learn.usingRunnableClass;

public class PrintingApp {

	public static void main(String[] args) 
	{
		//Creating objects of the class having implemented activities
		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		//Creating the Thread class objects and assigning their activities
		Thread t1 = new Thread(np);
		Thread t2 = new Thread(cp);
		//starting the threads
		t1.start();
		t2.start();
		
	}

}
