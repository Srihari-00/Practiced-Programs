package com.kodnest.arrays;

import java.util.Scanner;

public class PrinttheContentsIncrementOfTheArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the Array : ");
		//Creating the array
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int x :arr)//Advanced for loop
		{
			x=x+5;//adding the 5  to the each number in the array
			System.out.print(x+" ");
		}
		
	}

}
