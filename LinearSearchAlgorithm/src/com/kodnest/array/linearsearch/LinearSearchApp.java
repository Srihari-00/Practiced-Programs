package com.kodnest.array.linearsearch;

import java.util.Scanner;

public class LinearSearchApp 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//creating the scanner class
		System.out.println("Enter the length of the array : ");
		int arr[] = new int[scan.nextInt()];//creating an array and taking the length of the array from the user
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<=arr.length-1;i++)//where i is the index
		{
			arr[i]=scan.nextInt();//storing the elements in the array
		}
		System.out.println("Enter the Key element : ");
		int key = scan.nextInt();
		//calling the a static method of another class using is class name and storing it in a string type variable
		String x = LinearSearch.LinearSearchMethod(arr, key);
		System.out.println(x);//printing 

	}

}


