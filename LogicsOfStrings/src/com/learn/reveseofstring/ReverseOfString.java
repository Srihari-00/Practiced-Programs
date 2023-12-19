package com.learn.reveseofstring;

public class ReverseOfString 
{
	public static void printReversedString(String x)
	{
		System.out.println("The original String is : "+x);
		char [] arr=x.toCharArray();
		System.out.println("The Reversed string is : ");
		/*for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
			
		}*/
		char [] revarr=x.toCharArray();//Converting string into character type array
		int j=revarr.length-1;//initializing the j as length-1 of the revarr
		for(int i=0;i<=arr.length-1;i++)//where i=index of the array
		{
			revarr[j]=arr[i];//assigning the arr[i] elements to the revarr[j]
			j--;//decrementing the j
		}
		//creating an new string and storing revarr in it
		String revstr = new String(revarr);
		//Displaying the rev string
		System.out.println(revstr);
		
		
	}

}
