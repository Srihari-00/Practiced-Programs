package com.practice.areashapes;

class Triangle extends Shape
{
	int base;
	int height;

	public Triangle(int base, int height)
	{
		this.base = base;
		this.height = height;
	}

	public double calculateArea()
	{
		return 0.5 * base * height;
	}
}