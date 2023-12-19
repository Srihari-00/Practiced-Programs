package com.practice.twodimentional;

import java.util.Scanner;

public class TwoDimentional1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the 2D Array : ");
		double [] [] arr = new double[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the elements into the array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextDouble();
			}
		}
		System.out.println("Mobile Costs : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	

}
