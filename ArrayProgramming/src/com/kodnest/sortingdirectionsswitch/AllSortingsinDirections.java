package com.kodnest.sortingdirectionsswitch;

public class AllSortingsinDirections 
{
	public static void BubbleSortAssc(int arr[])
	{
		int temp;
		//where i = No.of Iterations
		for(int i=0;i<=arr.length-1;i++)
		{
			//where j=Indexes
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//Performing the swapping operation
				if(arr[j]>=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//Displaying the Array after Sorting
		System.out.println("The Array After using Bubble Sort in ascending order : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}
	public static void SelectionSortAssc(int arr[])
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
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void InsertionSortAssc(int [] arr)
	{
		System.out.println("The Array after InsertionSort in asccending order : ");
		for(int i=0;i<=arr.length-1;i++)//where i=index
		{
			int j=i-1;//initializing
			int element=arr[i];//initializing 
			while(j>=0 && arr[j]>element)//until j<0 and arr[j]<element
			{
				arr[j+1]=arr[j];//assigning the j to the j+1
				j--;//Decrementing
			}
			arr[j+1]=element;//assigning the element to the j+1
		}
		//Displaying the sorted array
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void BubbleSortDesc(int arr[])
	{
		int temp;
		//where i = No.of Iterations
		for(int i=0;i<=arr.length-1;i++)
		{
			//where j=Indexes
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//Performing the swapping operation
				if(arr[j]<=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//Displaying the Array after Sorting
		System.out.println("The Array After using Bubble Sort in ascending order : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void SelectionSortDesc(int arr[])
	{
		//Where i is for the index starting from 0 and going until arr.length-2
		for(int i=0; i<=arr.length-2;i++)
		{
			//initializing the min and storing the arr[i] in min
			int max = arr[i];
			//Assigning the i value to the position
			int pos = i;
			//where j is used to check all the elements after i
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//checking if the arr[j] is lesser than min or not
				if(arr[j]>max)
				{
					//assigning the arr[j] to the min
					max = arr[j];
					//assigning the j value to the pos
					pos = j;
				}
			}
			//Swapping the arr[pos] with the arr[i]
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		for(int x:arr)//Displaying the sorted array
		{
			System.out.print(x+" ");
		}

	}
	public static void InsertionSortDesc(int [] arr)
	{
		System.out.println("The Array after InsertionSort in Descending order : ");
		//where i=index
		for(int i=0;i<=arr.length-1;i++)
		{
			int j=i-1;//initializing the j=i-1
			int element=arr[i];//initializing the element as arr[i]
			//looping until j<0 and arr[j] value less than the element
			while(j>=0 && arr[j]<element)
			{
				arr[j+1]=arr[j];//assigning the j index value to the j+1 index value
				j--;//decrementing j 
			}
			arr[j+1]=element;//assigning the element value at index j+1
		}
		for(int x:arr)//Displaying the sorted array
		{
			System.out.print(x+" ");
		}
	}
}