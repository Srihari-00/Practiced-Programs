package com.leetcode.rotationcount;

import java.util.Scanner;

public class RotationCount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to be stored : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println(countOfRotations(arr));
		scan.close();
	}
	static int countOfRotations(int[] arr)
	{
		int pivot = findPivot(arr);
		return pivot+1;
	}
	public static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            } 
            else if(mid > start && arr[mid] < arr[mid - 1])
            {
                return mid-1;
            }
            else if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
            	if(arr[start] > arr[start + 1])
            	{
            		return start;
            	}
            	start++;
            	if(arr[end] < arr[end - 1])
            	{
            		return end-1;
            	}
            	end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
            	start = mid + 1;
            }
            else
            {
            	end = mid - 1;
            }
        }
        return -1;
    }

}
