package com.kodnest.selectionsort;

public class SelectionSort
{
	public static int[] selectionSort(int arr[])
	{
		//Where i is for the index starting from 0 and going until arr.length-2
		for(int i=0; i<=arr.length-2;i++)
		{
			//initializing the min and storing the arr[i] in min
			int min = arr[i];
			//Assigning the i value to the position
			int pos = i;
			//where j is used to check all the elements after i
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//checking if the arr[j] is lesser than min or not
				if(arr[j]<min)
				{
					//assigning the arr[j] to the min
					min = arr[j];
					//assigning the j value to the pos
					pos = j;
				}
			}
			//Swapping the arr[pos] with the arr[i]
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		//Returning the sorted array
		return arr;
	}
}
