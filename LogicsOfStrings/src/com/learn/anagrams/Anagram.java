package com.learn.anagrams;

import java.util.Arrays;

public class Anagram 
{
	public static String checkAnagram(String s1, String s2)
	{
		//Converting the strings into character type of arrays
		char []ch1 = s1.toCharArray();
		char []ch2 = s2.toCharArray();
		//Sorting the arrays using inbuilt method 
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//converting the sorted arrays into Strings
		String newstr1 = new String(ch1);
		String newstr2 = new String(ch2);
		//Comparing the values of the both string
		if(newstr1.equalsIgnoreCase(newstr2))
		{
			return "Both strings are anagrams";
		}
		return "Both strings are not anagrams";		
	}

}
