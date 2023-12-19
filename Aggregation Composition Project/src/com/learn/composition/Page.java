package com.learn.composition;

public class Page 
{
	String content;
	
	Page(String content)
	{
		this.content=content;
	}
	
	void diaplay()
	{
		System.out.println("Page content : "+content);
	}

}
