package com.kodnest.searchingsoptions;

import java.util.Scanner;

public class SearchingOptionsApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		//Creating an array of the length as user input
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements to be stored : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			//storing the elements in the array
			arr[i]=scan.nextInt();
		}
		//Displaying the array.
		System.out.println("The Array is : ");
		for(int x :arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter the key element to be searched : ");
		int key=scan.nextInt();//Storing the key value from the user in key variable
		System.out.println("Press 1 to perform Linear search method : ");
		System.out.println("Press 2 to perform Binary search method : ");
		int Option = scan.nextInt();//Asking the user to give the desired method to search method to be performed
		switch(Option)
		{
			case 1 :
				System.out.println("Linear Search");
				//calling the method which performs the linear search method
				String str=SearchingOptions.LinearSearchMethod(arr,key);
				System.out.println(str);
				break;
			case 2 :
				System.out.println("Binary Search ");
				//calling  a method which performs the binary search method.
				SearchingOptions.BinarySearchMethod(arr,key);
				break;
		}		
		

	}

}
