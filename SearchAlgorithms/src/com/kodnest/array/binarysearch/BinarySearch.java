package com.kodnest.array.binarysearch;

public class BinarySearch 
{
	static String binarySearchMethod(int arr[], int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high)//Checking whether the low is lesser or equal to high 
			{
				if(key==arr[mid])//if key is found, then return the statement
				{
					return ("The Key "+key+" is found in the array at index "+mid);
				}
				else if(key>arr[mid])//if key is greater than value of mid
				{
					low = mid+1;//increment the mid with 1 and assigning to the low
					mid=(low+high)/2;
					
				}
				else
				{
					//decrement the mid value, and assign to high
					high=mid-1;
					mid=(low+high)/2;
				}
				
					
			}
		return ("The key "+key+" is not found in the array ");
		}
	}


