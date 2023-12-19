package com.leetcode.missingNumber;
class MissingNumber 
{ 
	public static void main(String[] args)
	{
		int[] arr = {4, 0, 2, 1};
		System.out.println(missingNumber(arr));
	}
    static int missingNumber(int[] arr)
    {
    	int sumOfAll = arr.length*(arr.length+1)/2;
    	for(int i : arr)
    	{
    		sumOfAll -= i;
    	}
    	return sumOfAll;
    }
}