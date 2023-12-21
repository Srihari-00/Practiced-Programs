package com.queue.implementation;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the queue");
		int length = scan.nextInt();
		//calling the constructor
		Queue queue = new Queue(length);
		int choice=0;
		//Creating an Infinity loop
		while(true)
		{
			System.out.println("Press 1 for insertion");
			System.out.println("Press 2 for deletion");
			System.out.println("Press 3 for display");
			System.out.println("Enter any other to terminate the program");
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				//Calling the insertion method
				queue.insert();
				break;
			case 2:
				//Calling the deletion method
				queue.delete();
				break;
			case 3:
				//Calling the display method
				queue.display();
				break;
			default:
				System.out.println("Terminating the Program......");
				System.exit(0);

			}
		}
	}
}