package com.kodnest.sumofcorrespondingelementsstoredinanarray;

import java.util.Scanner;

public class SumOfCorrespondingElementsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length of the array1 : ");
		//Creating the array1 of length as user input
		int arr1[]= new int[scan.nextInt()];
		System.out.println("Enter the elements of the array1 : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			//Storing the elements in the array1
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the Length of the array2 : ");
		//Creating the array2 of length as user input
		int arr2[]= new int[scan.nextInt()];
		System.out.println("Enter the elements of the array1 : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			//Storing the elements in the array2
			arr2[i]=scan.nextInt();
		}
		System.out.println();
		//Displaying the array1
		System.out.println("The array1 : ");
		for(int x :arr1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//Displaying the array2
		System.out.println("The array2 : ");
		for(int x : arr2)
		{
			System.out.print(x+" ");
		}
		//calling a method which stores the sum of corresponding values of two array in the arra3 using its class name
		SumOfCorrespondingElements.StoreSumofElementsinanArray3(arr1, arr2);
	}

}
