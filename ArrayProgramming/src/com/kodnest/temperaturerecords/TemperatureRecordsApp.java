package com.kodnest.temperaturerecords;

import java.util.Scanner;

public class TemperatureRecordsApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int arr[]=new int[scan.nextInt()];//creating the array of length as user input
		System.out.println("Enter the Temperature that are recorded : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();//storing the array
		}
		//Displaying all the temperatures
		System.out.println("The recorded temperatures are : ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		//calling a method using its class name
		TemperatureRecords.calculateAverageofTemperatures(arr);
	}

}
