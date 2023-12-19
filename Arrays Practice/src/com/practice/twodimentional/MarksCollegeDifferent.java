package com.practice.twodimentional;

import java.util.Scanner;

public class MarksCollegeDifferent 

{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of colleges, students, marks : ");
		int [][][]arr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];

		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				for(int k=0;k<=arr[j].length-1;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("College1 : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				for(int k=0;k<=arr[j].length-1;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
	}
}