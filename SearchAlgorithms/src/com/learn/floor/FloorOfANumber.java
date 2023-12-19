package com.learn.floor;

import java.util.Scanner;

public class FloorOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		//Creating and storing the elements into the array
		int []arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to store in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be searched : ");
		int key = scan.nextInt();
		System.out.println(Floor(arr,key));
	}
	//Floor of a Number : The Greatest number in the array which is smaller than or equal to the target.
	static int Floor(int[] arr, int key)
	{
		int low=arr[0];
		int high = arr.length-1;
		int mid = (low+high)/2;
		while(low<=high)
		{
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
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
		return arr[high]; // Returning the element
		//return high;// Returning the index of the element
	}

}
