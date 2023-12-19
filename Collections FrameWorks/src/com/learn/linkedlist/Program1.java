package com.learn.linkedlist;

import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(true);
		ll.add(40);
		System.out.println(ll);//[10, 20, true, 40]

		ll.add(2,"Mango");
		System.out.println(ll);//[10, 20, Mango, true, 40]

		
	}

}
