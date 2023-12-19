package com.kodnest.sortingdirectionsswitch;

import java.util.Scanner;

import com.kodnest.checkarrysortedornot.ArraySortedOrNot;

public class AllSortingsinDirectionsApp {

	public static void main(String[] args) 
	{ 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Length of the array : ");
			//Creating an array of length as user input
			int arr[] = new int [scan.nextInt()];
			System.out.println("Enter the elements to be stored in array : ");
			for(int i=0;i<=arr.length-1;i++)//storing the elements in the array
			{
				arr[i]=scan.nextInt();
			}
			//displaying the array
			System.out.println("The Array is : ");
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			//Asking the user to give the desired method to be performed
			System.out.println("Press 1 to perform bubble sort in ascending order :");
			System.out.println("Press 2 to perform selection sort in ascending order");
			System.out.println("Press 3 to perform insertion sort in ascending order");
			System.out.println("Press 4 to perform bubble sort in descending order");
			System.out.println("Press 5 to perform selection sort in descending order");
			System.out.println("Press 6 to perform insertion sort in descending order");
			int option=scan.nextInt();//Storing the user input
			switch(option)
			{
			case 1://Bubble Sort Ascending order
				AllSortingsinDirections.BubbleSortAssc(arr);
				break;
			case 2://Selection Sort Ascending order
				AllSortingsinDirections.SelectionSortAssc(arr);
				break;
			case 3://Insertion sort Ascending order
				AllSortingsinDirections.InsertionSortAssc(arr);
				break;
			case 4://Bubble Sort Descending order
				AllSortingsinDirections.BubbleSortDesc(arr);
				break;
			case 5://Selection Sort Descending order
				AllSortingsinDirections.SelectionSortDesc(arr);
				break;
			case 6://Insertion Sort Descending order
				AllSortingsinDirections.InsertionSortDesc(arr);
				break;
			default:
				System.out.println("Invalid Input");
				
			}
		}

	}
}