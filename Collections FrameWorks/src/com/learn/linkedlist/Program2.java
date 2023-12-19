package com.learn.linkedlist;

import java.util.*;

public class Program2 {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		//using for loop --->Works
		/*for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}*/

		//Using Iterator Works
		/*Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/

		//Using for each loop--->works
		/*for(Object x : ll)
		{
			System.out.print(x+" ");
		}*/

		//Using the List Iterator---> gives infinite loop
		/*ListIterator itr = ll.listIterator(ll.size());
		while(itr.hasPrevious())
		{
			System.out.print(itr.hasPrevious()+" ");
		}*/

		//Using descending iterator---->works
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
