package com.ds.stack;

import java.util.Scanner;

public class StackImplementationApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the stack");
		int length = scan.nextInt();

		StackImplementation stack = new StackImplementation(length);
		while(true)
		{
			System.out.println("press 1 for inserting elements into the stack");
			System.out.println("press 2 to displaying elements present in the stack");
			System.out.println("press 3 to delete the elements from the stack");
			System.out.println("press anyother to terminate the program....");
			System.out.println("Enter you choice : ");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				stack.push();
				break;
			case 2:
				stack.display();
				break;
			case 3:
				stack.delete();
				break;
			default:
				System.out.println("Program is terminated.....");
				System.exit(0);
			}

		}
	}

}
