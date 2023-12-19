package com.kodnest.array.binarysearch;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key element to be searched : ");
		int key = scan.nextInt();
		
		 String x =BinarySearch.binarySearchMethod(arr, key);
		System.out.println(x);
	}

}
