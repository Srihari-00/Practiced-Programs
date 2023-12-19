package com.kodnest.arrays;

import java.util.Scanner;

public class ReverseArrayApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Length : ");
		int arr[] = new int[scan.nextInt()];//creating the array
		System.out.println("Enter the Elements to be stored in the array : ");
		for(int i=0;i<=arr.length-1;i++)//taking the user input and storing the elements
		{
			arr[i]=scan.nextInt();
			
		}
		//calling or invoking the method
		printArray(arr);
	
		
	}
	public static void printArray(int arr[])//passing the parameters
	{
		System.out.println("Array in the forward direction : ");
		//Displaying the forwarding array
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Array in the Reversed Direction : ");
		//displaying the reversed array
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	 }

}
