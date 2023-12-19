package com.learn.searchandsort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of the array  : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-2;i++)
		{
			int temp=0;
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}

	}

}
