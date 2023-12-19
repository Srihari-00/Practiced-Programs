package com.kodnest.countinggrades;

public class CountingGrades 
{
	public static void CheckStudentsGrades(int arr[])
	{
		int count=0;//initializing the count
		for(int i=0;i<=arr.length-1;i++)//where i is the array index
		{
			if(arr[i]>=75)//checking if the marks of the student is greater than or equal to 75
			{
				count++;//incrementing the count
			}
		}
		//Displaying the total number of students who got the above 75 marks
		System.out.println("The students who got above 75 are : "+count);
	}

}
