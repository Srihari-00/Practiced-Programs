package com.learn.ceiling;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfANumber {

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
		Arrays.sort(arr);
		System.out.println(ceiling(arr,key));
	}
	//Ceiling : The smallest number in the array which is greater than or equal to the target.
	static int ceiling(int[] arr, int key)
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
		//return arr[low];  Returning the element
		return low;// Returning the index of the element
	}

}
