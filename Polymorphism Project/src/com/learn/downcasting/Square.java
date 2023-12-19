package com.learn.downcasting;

public class Square extends Shape
{
	double side=10.5;
	double findArea()
	{
		System.out.println("Area of the Circle : ");
		return side*side;
	}
	double findPerimeter()
	{
		System.out.println("The Perimeter of the Circle : ");
		return 4*side;
	}

}
