package com.learn.downcasting;

public class ShapeApp {

	public static void main(String[] args) 
	{
		Geometry gr = new Geometry();
		Circle cr = new Circle();
		Rectangle rt = new Rectangle();
		Square sq = new Square();
		gr.doActivity(cr);
		System.out.println("======================================");
		gr.doActivity(sq);
		System.out.println("======================================");
		gr.doActivity(rt);
	
	}
}
