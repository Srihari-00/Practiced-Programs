package com.learn.checklengthofstrings;

public class LengthOfStrings
{
	public static void checkLengthOfTwoStrings(String x, String y)
	{
		int Length1 = x.length();
		int Length2 = y.length();
		
		if(Length1 == Length2)
		{
			System.out.println("Both the Strings are of Same Length ");
		}
		else
		{
			System.out.println("Both the Strings are of different Length ");
		}
	}

}
