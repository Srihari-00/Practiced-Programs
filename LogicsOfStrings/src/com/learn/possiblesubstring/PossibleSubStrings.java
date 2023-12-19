package com.learn.possiblesubstring;

public class PossibleSubStrings
{
	static void printAllSubStrings(String str)
	{
		char []ch = str.toCharArray();//converting string into char type of aray
		for(int i=0;i<=ch.length-1;i++)
		{
			String newstr="";
			for(int j=i;j<=ch.length-1;j++)
			{
				newstr=newstr+ch[j];//concatenating the character at index i to the newstr
				System.out.println(newstr);
			}
			
		}
	}

}
