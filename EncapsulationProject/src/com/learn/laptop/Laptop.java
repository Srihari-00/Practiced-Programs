package com.learn.laptop;

public class Laptop 
{
	//Private data members
	private String processorName;
	private int memorySize;
	
	//Constructor to set the values to the private data Members
	public Laptop(String processorName, int memorySize)
	{
		this.processorName=processorName;
		this.memorySize=memorySize;
	}
	
	//public getter methods for getting the values of the private data Members
	public String getProcessor()
	{
		return processorName;
	}
	
	public int getMemorySize()
	{
		return memorySize;
	}

}
