package com.learn.sortsearch;

import java.util.Scanner;

public class SortSearchApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Asking the array length
		System.out.println("Enter the length of the array : ");
		//creating an array
		int []arr = new int[scan.nextInt()];
		//Asking to enter the elements ton be stored
		System.out.println("Enter the elements to be stored in the array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();//Storing the elements
		}
		//Asking to enter the key element
		System.out.println("Enter the key to be searched among the array : ");
		int key = scan.nextInt();
		//Calling a method which checks the array is sorted or not
		SortSearch.checkArrayIsSorted(arr,key);
		
		
		

	}

}
