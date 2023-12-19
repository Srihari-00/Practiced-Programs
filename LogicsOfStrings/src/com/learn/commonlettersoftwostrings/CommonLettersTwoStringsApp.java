package com.learn.commonlettersoftwostrings;

import java.util.Scanner;

public class CommonLettersTwoStringsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String name1=scan.nextLine();//reading first string 
		System.out.println("Enter the 2nd String");
		String name2=scan.nextLine();//reading second string
		//calling a method which performs finding the same alphabets in both strings
		CommonLettersTwoStrings.findSameAlpha(name1,name2);

	}

}
