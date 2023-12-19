package com.kodnest.identifyevennumbers;

import java.util.Scanner;

public class IdentifyEvenNumbersApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[] = new int [scan.nextInt()];//creating an array of length as user input
		System.out.println("Enter the elements to be stored in the array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			//storing the elements in the array
			arr[i]=scan.nextInt();
		}
		//Displaying the elements
		System.out.println("The List is : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		//calling a method display even numbers using its class name
		IdentifyEvenNumbers.displayEvenNumbers(arr);

	}

}
