package com.learn.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(36);
		hs.add(10);
		hs.add(54);
		hs.add("Mango");
		System.out.println(hs);
		
		/* It cannot be accessed by using the for loop
		for(int i=0;i<hs.size();i++)
		{
			System.out.println(hs.get(i)+" ");
		}*/
		
		System.out.println("Using the for each loop");
		for(Object x : hs)
		{
			System.out.print(x+" ");
		}
		
		System.out.println("Using the Iterator ");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		/* It cannot be accessed by using the descending iterator
		Iterator ir = hs.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/
		
		
		
	}

}
