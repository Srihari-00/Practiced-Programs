package com.learn.unicodeofstring;

public class UnicodeOfString 
{
	public static void printUnicodesOfChar(String x)
	{
		char [] arr = x.toCharArray();
		
		for(int y : arr)
		{
			System.out.print(y+" ");
		}
	}

}
