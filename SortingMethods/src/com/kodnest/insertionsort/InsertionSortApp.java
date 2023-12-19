package com.kodnest.insertionsort;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int []arr= new int[scan.nextInt()];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before sorting : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		int[] res = InsertionSort.ApplyInsertionSort(arr);
		System.out.println();
		System.out.println("The array after sorting : ");
		for(int x:res)
		{
			System.out.print(x+" ");
		}
		
	}

}
