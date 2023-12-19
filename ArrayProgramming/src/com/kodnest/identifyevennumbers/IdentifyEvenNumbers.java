package com.kodnest.identifyevennumbers;

public class IdentifyEvenNumbers 
{
	public static void displayEvenNumbers(int arr[])
	{
		System.out.println();
		//Displaying the even numbers
		System.out.println("The even Numbers in the array are : ");
		int count=0;//initializing the count
		for(int i=0;i<=arr.length-1;i++)//where i is the index values
		{
			if(arr[i]%2==0)//checking if the value at index i is divisible by 2 or not
			{
				count++;//Incrementing the count
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("The total number of even numbers are "+count);
	}

}
