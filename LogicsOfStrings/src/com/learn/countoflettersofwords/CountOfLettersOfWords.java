package com.learn.countoflettersofwords;

public class CountOfLettersOfWords 
{
	static void printCountOfLettersOfWords(String s)
	{
		//Converting the string into the String type of array
		String str[]=s.split(" ");
		System.out.println("The total no.of words are : "+str.length);
		//Traversing the String Array
		for(int i=0;i<=str.length-1;i++)
		{
			//converting the Str[i] into character type of array
			char ch[]=str[i].toCharArray();
			//Displaying the out put.
			System.out.println("Characters Present in \""+str[i]+"\" is : "+ch.length);
		}
	}

}
