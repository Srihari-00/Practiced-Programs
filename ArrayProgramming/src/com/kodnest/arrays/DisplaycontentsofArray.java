package com.kodnest.arrays;

import java.util.Scanner;

public class DisplaycontentsofArray {

	public static void main(String[] args)
	{
		//Creating the scanner class to take the user input
		Scanner scan = new Scanner(System.in);
		//Enter the length of the array
		System.out.println("Enter the length of the Array :  ");
		int size = scan.nextInt();//Reading the input from the user
		int arr[] = new int[size];//creating the array
		//Asking the user to enter the elements to be stored in the array
		System.out.println("Enter the elements of the Array : ");
		//Reading 
		for(int i=0;i<=size-1;i++)//where i is the index value 
		{
			arr[i]=scan.nextInt();//Reading the input from the user
		}
		//Displaying a Message
		System.out.println("The Elements of the array are : ");
		for(int i=0;i<=size-1;i++)//where i is the index value
		{
			System.out.print(arr[i]+" ");//Displaying the content of the array
		}
		
		
	}

}
