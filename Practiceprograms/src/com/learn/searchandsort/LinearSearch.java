package com.learn.searchandsort;

import java.util.Scanner;

public class LinearSearch {

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
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key is found");
				return;
			}
		}
		System.out.println("Key is not present ");
	}

}
