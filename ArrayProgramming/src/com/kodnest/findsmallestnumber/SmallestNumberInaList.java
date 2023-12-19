package com.kodnest.findsmallestnumber;

public class SmallestNumberInaList 
{
	public static void findSmallestValue(int arr[])
	{
		int min=0;//initializing the minimum value
		System.out.println();
		System.out.println("The smallest value in the list is ");
		for(int i=0;i<=arr.length-1;i++)//for taking one element in i=index of the array
		{
			min=arr[i];//assigning the value at index0 to min
			for(int j=i;j<=arr.length-1;j++)//for comparing the element with other indexes
			{
				if(min>arr[j])//checking if the min value is greater than element at next index
				{
					min=arr[j];//assigning the value
				}
			}
		}
		//Displaying the smallest value
		System.out.println(min);
	}

}
