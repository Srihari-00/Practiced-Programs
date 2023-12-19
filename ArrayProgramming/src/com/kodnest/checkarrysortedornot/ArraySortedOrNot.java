package com.kodnest.checkarrysortedornot;

public class ArraySortedOrNot
{
	public static String checkArrayisSorted(int arr[])
	{
		boolean isSorted=true;//initializing the boolean data type
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					isSorted=false;//Assigning the isSorted as false
					break;
				}
			}
		}
		if(isSorted==true)//if the condition is true
		{
			return "Array is Sorted";
		}
		return "Array is not Sorted";
	}


}
