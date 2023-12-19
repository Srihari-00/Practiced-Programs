package com.kodnest.insertionsort;

public class InsertionSort
{
	public static int[] ApplyInsertionSort(int []arr)
	{
		for(int i=1;i<=arr.length-1;i++)
		{
				int element=arr[i];
				int j=i-1;
				while(j>=0 && arr[j]>element)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=element;
		}
		return arr;	
	}

}
