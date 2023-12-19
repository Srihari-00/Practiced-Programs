package com.learn.composition;

public class BookApp {

	public static void main(String[] args) 
	{
		Book bk = new Book();
		//bk.read();
		
		bk=null;
		bk.read();
	}

}
