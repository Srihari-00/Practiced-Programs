package com.leetcode.rotatedsearch.exe1;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to be stored in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the element to be searched : ");
		int target = scan.nextInt();
		SearchInRotatedSortedArray p = new SearchInRotatedSortedArray();
		System.out.println("The index of "+target+" is : "+p.search(arr, target));
		
	}
	
	public int search(int[] nums, int target) 
    {
        int pivot = findPivot(nums);
        //if you did not find a pivot, it means the array is not rotated
        if(pivot == -1)
        {
            //Just do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found, you have 2 asc sorted arrays
        else if(nums[pivot] == target)
        {
            return pivot;
        }
        else if(target >= nums[0])
        {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
	//This can work with the duplicate elements also
	//finding the pivot element if the array is rotated
    public int findPivot(int[] arr)
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
            		return end;
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
    //Doing normal binary search
    public int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(target == arr[mid])
            {
                return mid;
            }
            else if(target >= arr[mid])
            {
                start = mid + 1;
            }
            else if(target <= arr[mid])
            {
                end = mid - 1;
            }
        }
        return -1;
    }

}
