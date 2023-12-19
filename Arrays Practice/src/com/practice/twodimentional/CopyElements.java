package com.practice.twodimentional;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElements {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int []arr = new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]= scan.nextInt();
		}
		System.out.println("The copied elements ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Element"+(i+1)+" : "+arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
