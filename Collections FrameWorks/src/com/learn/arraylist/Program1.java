package com.learn.arraylist;

import java.util.*;

public class Program1 {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		//al.add("Mango");
		al.add(40);
		//al.add(true);
		al.add("");
		System.out.println(al);
		al.remove(1);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
	}

}
