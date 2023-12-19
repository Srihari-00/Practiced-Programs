package com.learn.searchandsort;

import java.util.Scanner;

public class BinarySearch {

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
		System.out.println("Enter the key to be searched : ");
		int key=scan.nextInt();
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[mid])
			{
				System.out.println("Key "+key+" is found at index "+mid);
				return;
			}
			else if(key>mid)
			{
				low=mid+1;
				mid=(low+high)/2;
			}
			else
			{
				high=mid-1;
				mid=(low+high)/2;
			}
		}
		System.out.println("Key "+key+" is not present in the array ");

	}

}
