package com.kodnest.searchingsoptions;

public class SearchingOptions 
{
	public static String LinearSearchMethod(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)//checking if the key element and the array element is equal or not
			{
				return "Key "+key+" is present at index "+i;//returning a string type value
			}
			
		
		}
		return "Key "+key+" is not present in the array ";//returning a string type value
	}

	public static void BinarySearchMethod(int arr[], int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int low=0;
			int high=arr.length-1;
			int mid=(low+high)/2;
			while(low<=high)
			{	if(key==arr[mid])
				{
					System.out.println("The key "+key+" is found at index "+mid);
					return;
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
			System.out.println("The key "+key+" is not found in the array ");
			break;
		}
	}

}
