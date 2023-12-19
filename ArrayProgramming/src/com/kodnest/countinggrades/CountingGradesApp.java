package com.kodnest.countinggrades;

import java.util.Scanner;

public class CountingGradesApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Students :");
		//Creating an array of the length as same as students count
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the marks of each student : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			//storing the marks of the students in the array
			arr[i]=scan.nextInt();
		}
		//Displaying the marks of the students.
		System.out.println("The marks of all students are : ");
		for(int x :arr)
		{
			System.out.print(x+" ");
		}
		//calling a method to check the students who got above 75
		CountingGrades.CheckStudentsGrades(arr);
		
	}

}
