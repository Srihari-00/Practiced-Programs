package com.learn.cyclicsort;

import java.util.Scanner;

public class CycleSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the length of the array");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to be stored in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Before swapping the elements : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		//Performing the Cyclic Sort
		int i=0;
		while(i<arr.length)
		{
			int correct = arr[i]-1;
			if(arr[i] != arr[correct])
			{
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			}
			else
			{
				i++;
			}
		}
		System.out.println();
		System.out.println("After sorting the array");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
	}

}
