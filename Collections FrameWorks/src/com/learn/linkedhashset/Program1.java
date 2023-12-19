package com.learn.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program1 {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(50);
		lhs.add(20);
		lhs.add(10);
		lhs.add(40);
		lhs.add(30);
		
		//System.out.println(lhs);
		
		/* It cannot be accessed by using the for loop
		for(int i=0;i<lhs.size();i++)
		{
			System.out.println(lhs.get(i));
		}*/
		System.out.println("Using the for each loop");
		for(Object x : lhs)
		{
			System.out.print(x+" ");
		}
		System.out.println("Using the iterator");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		/* It cannot be accessed by using the descending Iterator
		System.out.println("Using the Descending iterator");
		Iterator ditr = lhs.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/
		
	}

}
