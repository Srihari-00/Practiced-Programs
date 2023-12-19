package com.practice.twodimentional;

import java.util.Scanner;

public class TwoDimensional2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array  : ");
		float arr[][][] = new float[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the Heights : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					arr[i][j][k]=scan.nextFloat();
				}
			}
		}
		System.out.println("The Heights : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println(	arr[i][j][k]);
				}
			}
		}
		
		
	}

}
