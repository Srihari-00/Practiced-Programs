package com.kodnest.sumofcorrespondingelementsstoredinanarray;

public class SumOfCorrespondingElements 
{
	public static void StoreSumofElementsinanArray3(int arr1[], int arr2[])
	{
		//Creating the third array of length same as the array1/array2
		int arr3[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)// where i is for array1
		{
			for(int j=0;j<=arr2.length-1;j++)//where j is for array2
			{
				//storing the sum of corresponding values in the array3
				arr3[i]=arr1[i]+arr2[j];
			}
		}
		//Displaying the array3
		System.out.println();
		System.out.println("The sum of the corresponding elements of two arrays is stored in array3 : ");
		for(int x: arr3)
		{
			System.out.print(x+" ");
		}
	}

}
