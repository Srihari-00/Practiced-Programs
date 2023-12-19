package com.kodnest.sumofpositivennumbers;

public class SumOfPositiveNumbers 
{
	public static void calculateSumofPositives(int arr[])
	{
		int sum=0;//initializing the sum
		for(int i=0;i<=arr.length-1;i++)//where i is the index
		{
			if(arr[i]>=0)//checking if the number is positive or not
			{
				sum+=arr[i];//adding the numbers and assigning it to the sum
			}
		}
		//displaying the sum
		System.out.println("The sum of all positives is "+sum);
	}

}
