package com.leetcode.acronyms;

import java.util.Scanner;

public class AcronymString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.nextLine();
		String a = scan.next();
		System.out.println(isAcronym(s,a));

	}
	static boolean isAcronym(String s, String a)
	{
		//Converting the string into string type array
		String[] s1 = s.toLowerCase().split(" ");
		String newstr="";//Creating an empty string
		//Traversing through the array
		for(int i=0;i<s1.length;i++)
		{
			//converting the s1[i] into string
			String ss =s1[i].toString();
			//concatenating the character at 0th index with newstr
			newstr=newstr.concat(ss.charAt(0)+"");
		}
		//Checking if the values of the both strings are equal or not
		if(newstr.equals(a))
		{
			return true;
		}
		return false;
	}

}
