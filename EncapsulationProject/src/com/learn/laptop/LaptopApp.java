package com.learn.laptop;

public class LaptopApp {

	public static void main(String[] args) 
	{
		//Creating the first Laptop object and 
		//Setting the values to the private data members through data members
		Laptop L1 = new Laptop("Ryzen 7", 2);
		//Getting the values of the private data members through getter methods
		System.out.println(L1.getProcessor()+" "+L1.getMemorySize());
		//Creating the second Laptop object and 
		//Setting the values to the private data members through data members		
		Laptop L2 = new Laptop("intel 9", 512);
		//Getting the values of the private data members through getter methods
		System.out.println(L2.getProcessor()+" "+L2.getMemorySize());
	}

}
