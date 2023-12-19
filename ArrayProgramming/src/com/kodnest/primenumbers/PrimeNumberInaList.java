package com.kodnest.primenumbers;

public class PrimeNumberInaList 
{
	public static void findPrimeNumbers(int arr[])
	{
		int count=0;//initializing the count
		System.out.println();
		System.out.println("The Prime Numbers are : ");
		for(int j=0;j<=arr.length-1;j++)//where j is for indexes of the array
		{
			count=0;
			for(int k=2;k<=arr[j];k++)//for checking with other numbers
			{
				if(arr[j]%k==0)//checking the remainder of arr[j] divided by k
				{
					count++;//incrementing the count
				}
			}
			if (count==1)//if count =1
			{
				System.out.print(arr[j]+" ");//display
			}
		}
	}
}