package com.queue.implementation;

import java.util.Scanner;

public class Queue 
{
	//Creating private variables
	private int[] q;
	private int size;
	private int rear = -1;
	private int front = 0;
	private Scanner scan = new Scanner(System.in);
	//Parameterized constructor
	public Queue(int length)
	{
		//creating the queue of length 'length'
		q = new int[length];
		//Assigning the size of the queue
		size = q.length;
	}
	//Inserting the values into the queue
	public void insert()
	{
		int elem ;
		if(rear == size-1)
		{
			System.out.println("Queue is full, insertion not possible");
		}
		else
		{
			System.out.println("Enter the element..");
			elem = scan.nextInt();
			++rear;//incrementing the rear
			q[rear] = elem;//inserting the element at the rear position of the queue
		}
	}
	//Deleting the elements from the queue
	public void delete()
	{
		if(rear == -1 || front > rear)
		{
			System.out.println("Queue is empty, Deletion is not possible");
		}
		else
		{
			System.out.println("Element deleted : "+q[front]);
			++front;//incrementing the front
		}
	}
	//Displaying the Queue elements
	public void display()
	{
		if(rear == -1 || front > rear)
		{
			System.out.println("Queue is empty, Display is not possible");
		}
		else
		{
			//Traversing through the Queue
			for(int i=front;i<=rear;i++)
			{
				System.out.print(q[i]+" ");
				
			}
			System.out.println();
		}
		
	}
	
	
	
}
