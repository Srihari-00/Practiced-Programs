package com.learn.reverselettersofwords;

public class ReverseLettersOfWords 
{
	static void printReverseOfLettersOfWords(String str)
	{
		//converting string into array of string type
		String []arr=str.split(" ");
		//traverse string for getting the each word
		for(String x:arr)
		{
			String newstr="";//creating the empty string to store the new string
			//traversing on each word  from last index of the word to the 0th index
			for(int i=x.length()-1;i>=0;i--)
			{
				//concatenating every character to the news string
				newstr=newstr+x.charAt(i);
			}
			//Displaying after traversing 
			System.out.print(newstr+" ");
		}
		
	}

}
