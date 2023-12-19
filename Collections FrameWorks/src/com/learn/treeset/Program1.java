package com.learn.treeset;

import java.util.Iterator;
import java.util.*;

public class Program1 {

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(50);
		ts.add(40);
		ts.add(30);
		
		/* It cannot be accessed by using the for loop
		for(int i=0;i<ts.size();i++)
		{
			System.out.print(ts.get);
		}*/
		System.out.println(ts);
		System.out.println("USing the for each loop");
		for(Object x : ts)
		{
			System.out.print(x+" ");
		}
		
		System.out.println("Using the iterator ");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("Using the desccending Iterator");
		Iterator it = ts.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
 	}

}
