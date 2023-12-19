package com.kodnest.arrays;

import java.util.Scanner;

public class SwappingTheIndexOfAnArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array : ");
		int arr[] = new int[scan.nextInt()];//creating the array
		System.out.println("Enter the elements to be stored : ");
		//storing the elements in the array by the user input
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Displaying the array Before swapping
		System.out.println("Before Swapping the elements : ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//Asking the user to give two indexes as input 
		System.out.println("Enter the two indexes to be swapped : ");
		int index1=scan.nextInt();
		int index2=scan.nextInt();
		System.out.println("After swapping the elements : ");
		//Swapping operation using the third variable
		int temp=0;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		//Displaying the array after swapping 
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
	}

}
