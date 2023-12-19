package com.kodnest.array.linearsearch;

public class LinearSearch
{
	static String LinearSearchMethod(int arr[], int key)//passing the parameters 
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

}


