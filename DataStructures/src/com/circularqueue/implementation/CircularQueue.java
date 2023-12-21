package com.circularqueue.implementation;

import java.util.Scanner;

public class CircularQueue 
{
	private int cq[];
	private int size;
	private int rear = -1;
	private int front = 0;
	private int count = 0;
	private Scanner scan = new Scanner(System.in);
	
	public CircularQueue(int length)
	{
		cq = new int[length];
		size = cq.length;
	}
	
	public void insert()
	{
		int elem;
		if(count == size)
		{
			System.out.println("Circular Queue is full, Insertion is not possible");
		}
		else
		{
			System.out.println("Enter the element to be insert");
			elem = scan.nextInt();
			rear = (rear+1)%size;
			cq[rear] = elem;
			count++;
		}
	}
	
	public void delete()
	{
		if(count==0)
		{
			System.out.println("Circular Queue is empty, Deletion is not possible");
		}
		else
		{
			System.out.println("Deleted element : "+cq[front]);
			front = (front+1)%size;
			count--;
		}
	}
	public void display()
	{
		int f1 = front;
		if(count == 0)
		{
			System.out.println("Circular Queue is empty, Display not possible");
		}
		else 
		{
			for(int i=1;i<=count;i++)
			{
				System.out.println(cq[f1]+" ");
				f1 = (f1+1)%size;				
			}
			System.out.println();
		}
	}
}