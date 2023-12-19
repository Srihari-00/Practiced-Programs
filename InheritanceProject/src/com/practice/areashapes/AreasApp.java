package com.practice.areashapes;

import java.util.Scanner;

public class AreasApp 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the shape you want to perform : ");
		String shapeType = scan.nextLine();
		switch (shapeType)
		{
		case "Rectangle":
			System.out.println("Enter the length of the rectangle : ");
			int length = scan.nextInt();
			System.out.println("Enter the width of the rectangle : ");
			int width = scan.nextInt();
			Rectangle rectangle = new Rectangle(length, width);
			System.out.println("Area: " + rectangle.calculateArea());
			break;
			
		case "Circle":
			System.out.println("Enter the radius of the circle");
			int radius = scan.nextInt();
			Circle circle = new Circle(radius);
			System.out.println("Area: " + circle.calculateArea());
			break;
		case "Triangle":
			System.out.println("Enter the base of the triangle : ");
			int base = scan.nextInt();
			System.out.println("Enter the height of the triangle : ");
			int height = scan.nextInt();
			Triangle triangle = new Triangle(base, height);
			System.out.println("Area: " + triangle.calculateArea());
			break;
		
		default:
			System.out.println("Invalid shape type.");
		}
	}
}
