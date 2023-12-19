package com.practice.quizs;

public class ListsAdd {

	public static void main(String[] args) 
	{
		int[] arr1 = {5,5,6};
		int[] arr2 = {7,4,1};
		int[] res = new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			res[i] = arr1[i]+arr2[i];
		}
		for(int x : res)
		{
			System.out.println(x);
		}
	}

}
