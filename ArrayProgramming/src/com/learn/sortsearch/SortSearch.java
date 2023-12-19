package com.learn.sortsearch;

public class SortSearch 
{
	static void checkArrayIsSorted(int []x,int key)
	{
		//initializing the isSorted as true
		boolean isSorted = true;
		for(int i=0;i<=x.length-2;i++)//for checking the values at index 
		{
			for(int j=i+1;j<=x.length-1;j++)
			{
				if(x[i]<x[j])//checking if the elements is less than or not
				{
					isSorted=false;//assigning the false to the isSorted
					break;
				}
			}	
		}
		if(isSorted)//true
		{
			//Display the array using the for-Each loop
			System.out.println("The Array is Sorted");
			System.out.println("The array elements are : ");
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			//calling the method which performs binary search
			BinarySearch(x,key);
		}
		else
		{
			//Display array is not sorted
			System.out.println("The Array is Not Sorted");
			//calling a method which performs selection sort
			SelectionSort(x,key);
		}
		
	}
	static void SelectionSort(int[]arr,int key)
	{
		//Displaying the elements before sort
		System.out.println("The array before Sort : ");
		for(int y:arr)
		{
			System.out.print(y+" ");
		}
		for(int i=0;i<=arr.length-2;i++)//where i=index
		{
			int min=arr[i];//initializing the min with value at arr[i]
			int pos=i;//initializing pos = i 
			for(int j=i+1;j<=arr.length-1;j++)//where j=index
			{
				if(arr[j]<min)//checking if arr[j]<min or not
				{
					min=arr[j];//assigning arr[j] to the min
					pos=j;		//assigning pos=j
				}
			}
			//Swapping
			int temp;
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		System.out.println();
		//Displaying the array after sorting
		System.out.println("The array after sorting : ");
		for(int y:arr)
		{
			System.out.print(y+" ");
		}
		//calling a method which performs binary search
		BinarySearch(arr,key);
		
	}
	static void BinarySearch(int []x, int key)
	{
		int low=0;//initializing the low=0
		int high=x.length-1;//initializing the high=arr.length-1
		int mid=(low+high)/2;//calculating mid value
		System.out.println();
		while(low<=high)//until low is less than or equal to high
		{			
			if(key==x[mid])//key value is equal to arr[mid]
			{
				//Display 
				System.out.println("The Key "+key+" found at index "+mid);
				return;
			}
			else if(key>x[mid])//if key is greater than arr[mid]
			{
				low=mid+1;//assigning the mid+1 to the low
				mid=(low+high)/2;//calculating mid 
			}
			else//if the key value is less than mid 
			{
				high=mid-1;//assigning the mid-1 value to the high
				mid=(low+high)/2;//calculating the mid value
			}
		}
		//Displaying 
		System.out.println("The key "+key+" is not present in the array ");
		return;
	}
}
