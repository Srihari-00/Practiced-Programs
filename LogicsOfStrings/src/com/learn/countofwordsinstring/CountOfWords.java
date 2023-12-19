package com.learn.countofwordsinstring;

public class CountOfWords
{
	static void printCountOfWords(String s)
	{
		//Converting the string into string array using split()
		String str[]=s.split(" ");
		//Displaying the no.of words
		System.out.println("The Total Number of words are : "+str.length);
		//Traversing the array
		for(int i=0;i<=str.length-1;i++)
		{
			//Displaying the words.
			System.out.println("Word "+(i+1)+" : "+str[i]);
		}
	}

}
