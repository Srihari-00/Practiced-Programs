package com.learnmultithreading.singlerunmethod;

public class ProgramApp {

	public static void main(String[] args) 
	{
		//Creating the object of the class in which activities are present
		Program pr = new Program();
		//Creating the object of the Thread class and assigning the activities
		Thread t1 = new Thread(pr);
		Thread t2 = new Thread(pr);
		//Changing the name of the Threads
		t1.setName("Number");
		t2.setName("Char");
		//calling the run() by calling the start()
		t1.start();//Starting the t1 thread to do NumPrinting
		t2.start();//Starting the t2 thread to do CharPrinting

	}

}
