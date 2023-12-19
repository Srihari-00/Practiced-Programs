package com.practice.subarraysum;

import java.util.Scanner;

public class SubArraySum 
{
	 public static void main(String[] args)
	 {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter the size of the array");
		    int size = scanner.nextInt();
		    System.out.println("Enter the elements");
		    int[] array = new int[size];
		    for (int i = 0; i < size; i++) 
		    {
		      array[i] = scanner.nextInt();
		    }
		    int maxSubarraySum = findMaxSubarraySum(array);
		    System.out.println(maxSubarraySum);
		  }
		  private static int findMaxSubarraySum(int[] array)
		  {
		    int maxSum = Integer.MIN_VALUE;
		    int currentSum = 0;
		    for (int value : array) 
		    {
		      currentSum = Math.max(value, currentSum + value);
		      maxSum = Math.max(maxSum, currentSum);
		    }
		    return maxSum;
		  }
}