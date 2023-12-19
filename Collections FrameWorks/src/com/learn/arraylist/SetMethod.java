package com.learn.arraylist;

import java.util.ArrayList;

public class SetMethod {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Before setting the value at index" );
		System.out.println(al);
		al.set(2, 99);
		al.set(4, 44);
		System.out.println("After setting the value at index");
		System.out.println(al);
	}

}
