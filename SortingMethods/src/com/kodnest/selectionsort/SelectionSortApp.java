package com.kodnest.selectionsort;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array : ");
		//Creating the Array and Asking its length
		int [] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to be stored into the Array : ");
		//Storing the elements into the Array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Displaying the array before sorting
		System.out.println("Array before sorting : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		//Calling the selection sort Method and storing in an array
		int []array = SelectionSort.selectionSort(arr);
		//Displaying the array after sorting 
		System.out.println();
		System.out.println("Array after sorting : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
