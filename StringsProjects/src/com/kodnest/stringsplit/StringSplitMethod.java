package com.kodnest.stringsplit;

public class StringSplitMethod {

	public static void main(String[] args) 
	{
		String str = "Java SQL Python";
		System.out.println("The string before split method"+str);
		String []arr=str.split("a");//Delete the character a from the String
		System.out.println("The string after the split method ");
		for(String x:arr)
		{
			System.out.println(x);
		}

	}

}
