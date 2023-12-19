package com.kodnest.arrays;

import java.util.Scanner;

public class PrintTheContentIfItIsPositive {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[] = new int [scan.nextInt()];
		System.out.println("Enter the elements in the array : ");
		for(int i=0; i<=arr.length-1;i++)//where i is the index
		{
			arr[i]=scan.nextInt();
		}
		for(int x: arr)//enhanced for loop
		{
			if(x>0)//checks for positive
			{
				System.out.print(x+" ");
			}
		}

	}

}
