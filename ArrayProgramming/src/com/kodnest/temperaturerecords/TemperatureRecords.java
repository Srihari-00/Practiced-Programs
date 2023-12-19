package com.kodnest.temperaturerecords;

public class TemperatureRecords 
{
	public static void calculateAverageofTemperatures(int arr[])
	{
		int average;
		int sum=0;//initializing the sum
		for(int i=0;i<=arr.length-1;i++)//where i is the array
		{
			sum+=arr[i];//adding all the values and assigning it to the sum
		}
		//Calculating the average of temperatures
		average=sum/arr.length ;
		//Displaying the average
		System.out.println("The average Temperature is : "+average);
	}

}
