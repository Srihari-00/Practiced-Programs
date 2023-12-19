package com.learn.upperlowercasecount;

public class CountUppercaseLowercase {

	public static void countUpperAndLowercaseLetters(String x) 
	{
		//converting the string into character type array
		char [] arr = x.toCharArray();
		//initializing count1 and count2 as 0 
		int count1=0;
		int count2=0;
		for(int i=0;i<=arr.length-1;i++)//where i=index for the array
		{
			if(arr[i]>=65 && arr[i]<=96)//checks whether if the character is upper case or not
			{
				count1++;//incrementing count1+1
			}
			else if(arr[i]>=97 && arr[i]<=126)//checks whether if the character is Lower case or not
			{
				count2++;//Incrementing Count2+1
			}
		}
		//Displaying the output
		System.out.println("The count of UpperCase Letters is : "+count1);
		System.out.println("The count of LowerCase Letters is : "+count2);	
	}
}
