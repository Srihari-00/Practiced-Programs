package com.ds.stack;

import java.util.Scanner;

public class StackImplementation 
{
	private int []s;
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);

	public StackImplementation(int n)
	{
		s = new int[n];
		size = s.length;
	}
	//Inserting or pushing the element into the stack
	public void push()
	{
		if(top == size-1)
		{
			System.out.println("Push is not possible...");
			return;
		}
		else
		{
			int ele;
			System.out.println("Enter the element : ");
			ele = scan.nextInt();
			++top;
			s[top] = ele;
		}
	}
	//Deleting a element from the stack
	public void delete()
	{
		if(top<0) {
			System.out.println("Deletion is not possible because stack is empty");
		}
		else {
			System.out.println("Deleted element is  : "+s[top]);
			--top;
		}
	}
	//Displaying the stack
	public void display()
	{
		
		if(top < 0) {
			System.out.println("Stack is empty......");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(s[i]);
			}
		}
	}
}
