package com.learn.downcasting;

public class Rectangle extends Shape
{
	double length=5.0, breadth=10.5;
	double findArea()
	{
		System.out.println("Area of the Circle : ");
		return length*breadth;
	}
	double findPerimeter()
	{
		System.out.println("The Perimeter of the Circle : ");
		return 2*(length+breadth);
	}

}
