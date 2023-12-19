package com.kodnest.checkarrysortedornot;

import java.util.Scanner;

public class ArraySortedOrNotApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length of the array : ");
		//Creating an array of length as user input
		int arr[] = new int [scan.nextInt()];
		System.out.println("Enter the elements to be stored in array : ");
		for(int i=0;i<=arr.length-1;i++)//storing the elements in the array
		{
			arr[i]=scan.nextInt();
		}
		//displaying the array
		System.out.println("The Array is : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		//calling and storing the result of the method array is sorted
		String result=ArraySortedOrNot.checkArrayisSorted(arr);
		//displaying the result
		System.out.println(result);
	}

}
