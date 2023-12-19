package com.learn.arraylist;

import java.util.ArrayList;

public class AddAllMethod {

	public static void main(String[] args) 
	{
		ArrayList fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Banana");
		System.out.println("Fruits List");
		System.out.println(fruits);
		
		ArrayList veg = new ArrayList();
		veg.add("Brinjal");
		veg.add("Lady Finger");
		veg.add("Bottle Gaurd");
		System.out.println("Vegetables List");
		System.out.println(veg);
		
		ArrayList groceries = new ArrayList();
		groceries.addAll(fruits);
		groceries.addAll(1, veg);
		System.out.println("Groceries List");
		System.out.println(groceries);
	}

}
