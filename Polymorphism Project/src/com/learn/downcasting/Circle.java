package com.learn.downcasting;

public class Circle extends Shape
{
	double radius = 5.5;
	double findArea()
	{
		System.out.println("Area of the Circle : ");
		return Math.PI*radius*radius;
	}
	double findPerimeter()
	{
		System.out.println("The Perimeter of the Circle : ");
		return 2*Math.PI*radius;
	}

}
