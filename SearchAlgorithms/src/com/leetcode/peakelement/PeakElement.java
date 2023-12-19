package com.leetcode.peakelement;

import java.util.Scanner;

public class PeakElement 
{
	   public int peakIndexInMountainArray(int[] arr)
	    {
	        int start=0;
	        int end=arr.length-1;
	        while(start < end)
	        {
	            int mid=(start+end)/2;
	            if(arr[mid] > arr[mid+1])
	            {
	                //you are in descending part of the array
	                //This may be the answer
	                end = mid; // This is why the end != mid-1
	            }
	            else
	            {
	                //You are in ascending part of the array
	                start = mid + 1;
	                //Because we know that mid + 1 element > mid element
	            }
	        }
	        //in the end, start == end and pointing to the largest number because of 2 checks
	        //Start and end are always trying to find the max element in the above 2 checks
	        //Hence, when they are pointing to just one element, that is the max one because that is what check say
	        //More elaboration, at every point of the time for start and end, they have the best possible answer till that time, and
	        //if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer.

	        return start;// or return end as both are equal
	        
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        int[] arr = new int[scan.nextInt()];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i] = scan.nextInt();
	        }
	        PeakElement p = new PeakElement();
	        System.out.print("The peak element is : ");
	        System.out.println(p.peakIndexInMountainArray(arr));
	    }

}
