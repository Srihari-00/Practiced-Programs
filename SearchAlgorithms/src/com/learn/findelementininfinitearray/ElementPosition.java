package com.learn.findelementininfinitearray;

import java.util.Scanner;

//Find the position of an element in the infinite Array
public class ElementPosition {

	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160};
		int target = 160;
		System.out.println(findPosition(arr, target));
	}
	//Finding the range of the array
	static int findPosition(int[] arr,int target)
	{
		//Considering the length as 2
		int start = 0;
		int end = 1;
		while(end < arr.length && target > arr[end])
		{
			int temp = end+1;//This is the new start
			//double the size of the box
			//end = previous end + size of box * 2
			end = end + (end - start +1)*2;
			start = temp;
						
		}
		 // Make sure that end doesn't exceed the array's length
	    end = Math.min(end, arr.length - 1);
		//passing the range of the array
		return (binarySearch(arr, target, start, end));
	}
	//Binary search to find the position of the array
	static int binarySearch(int[] arr, int target, int start, int end)
	{
		while(start<=end)
		{
			int mid = (start + end)/2;
			if(target == arr[mid])
			{
				return mid;
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid - 1;
			}
		}
		return -1;
	}

}
