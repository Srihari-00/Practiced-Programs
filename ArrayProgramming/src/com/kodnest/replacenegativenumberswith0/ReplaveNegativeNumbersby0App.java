package com.kodnest.replacenegativenumberswith0;

import java.util.Scanner;

public class ReplaveNegativeNumbersby0App {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Length of the array : ");
		//Creating the array of length as per user input
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements to store in the array : ");
		//Reading the input from the user
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Displaying the array before replacing the negative values by 0
		System.out.println("The array before replacement of negative values : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		//calling the method by using the its class name 
		ReplaceNegativeNumbersby0.negativeValuesReplaced(arr);
		

	}

}
