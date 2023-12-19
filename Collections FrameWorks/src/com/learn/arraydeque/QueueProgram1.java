package com.learn.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class QueueProgram1 {

	public static void main(String[] args) 
	{
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		Iterator itr = ad.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
