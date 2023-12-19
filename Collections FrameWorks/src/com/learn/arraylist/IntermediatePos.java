package com.learn.arraylist;

import java.util.ArrayList;

public class IntermediatePos {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Mango");
		al.add(40);
		al.add(true);
		System.out.println("Before adding at intermediate positions : ");
		System.out.println(al);
		System.out.println("After adding at intermediate positions : ");
		al.add(2,99);
		al.add(4,false);
		System.out.println(al);
	}

}
