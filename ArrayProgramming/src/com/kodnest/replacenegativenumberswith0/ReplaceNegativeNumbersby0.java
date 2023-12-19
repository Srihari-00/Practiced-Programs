package com.kodnest.replacenegativenumberswith0;

public class ReplaceNegativeNumbersby0 
{
	public static void negativeValuesReplaced(int arr[])
	{
		//for i=indexes
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0)//checking if the value at the index is negative or not 
			{
				arr[i]=0;//assigning the arr[i]=0
			}
		}
		//Displaying the array after the replacement of negative numbers with 0
		System.out.println();
		System.out.println("The array after Replacement of negative numbers in an array : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
