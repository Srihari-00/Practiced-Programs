package com.learn.composition;

public class Book 
{
	Page pg ;
	 
	Book()
	{
		pg = new Page("Java Content");
	}
	void read()
	{
		System.out.println("Reading the Book");
		pg.diaplay();
	}

}
