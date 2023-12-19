package com.kodnest.convertstringtochararray;

public class StringtoCharArr {

	public static void main(String[] args) 
	{
		String str = "Java SQL Python";
		//Converting the string into a character type array
		char ch[]=str.toCharArray();
		//Displaying the char Array
		for(char x:ch)
		{
			System.out.print(x+" ");
		}
	}

}
