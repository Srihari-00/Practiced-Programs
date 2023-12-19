package com.practice.twodimentional;

import java.util.Scanner;

public class StirngArray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		String []arr = new String[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("Employee names are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Employee"+(i+1)+" : "+arr[i]);
		}
		
		
	}

}
