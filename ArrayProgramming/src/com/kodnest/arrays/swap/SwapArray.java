package com.kodnest.arrays.swap;

import java.util.Scanner;

public class SwapArray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[scan.nextInt()];//creating the array
		System.out.println("Enter the elements to store in the aray :");
		for(int i=0;i<=arr.length-1;i++)//storing the elements of array
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array before swapping : ");
		for(int x:arr)//Displaying the array
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter two indexes to be swapped : ");
		//Taking the user input as two indexes
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int temp=0;
		//Swapping operation using third variable
		temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
		//printing
		System.out.println("The array after swapping : ");
			for(int x : arr)
			{
				System.out.print(x+" ");
			}

	}

}
