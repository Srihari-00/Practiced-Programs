package com.learn.priorityqueue;
import java.util.*;
public class Program1 {

	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		pq.add(50);
		pq.add(10);
		pq.add(20);
		pq.add(60);
		pq.add(30);
		pq.add(40);
		
		//It can not access by the using the for loop
		/*for(int i=0;i<pq.size();i++)
		{
			System.out.print(pq.get);
		}*/
		
		//It can be accessed by using the for each loop
		System.out.println("Using the for each loop : ");
		for(Object x : pq)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//It can be accessed by using the Iterator
		System.out.println("Using the Iterator : ");
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		/* It cannot be accessed by using the List Iterator
		Iterator it = pq.listIterator(pq.size());
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/
		
		/* It cannot be accessed by using the descendingIterator()
		Iterator it = pq.descendingIterator();*/
		
	}

}
