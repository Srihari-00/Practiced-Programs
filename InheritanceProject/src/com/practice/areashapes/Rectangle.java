package com.practice.areashapes;

public class Rectangle extends Shape
{
	int length;
	int width;

	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	public int calculateArea() 
	{
		return length * width;
	}
}

