package com.learn.reversewordsofstring;

public class ReverseWordsOfString 
{
	static String printReverseWords(String str)
	{
		String []arr = str.split(" ");//Splitting the string and storing in a string type of array
		String newstr="";//creating an empty string
		for(int i=arr.length-1;i>=0;i--)//where i=index of the array
		{
			//concatenating and storing the array in reverse of words
			newstr=newstr.concat(arr[i]+" ");
		}
		//Displaying the string
		return(newstr);
	}

}
