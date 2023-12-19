package com.learn.replacevowelswith99;

import java.util.Scanner;

public class ReplaceVowelsWith99App {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();//Reading the string from the user
		//Calling a method which replaces all the vowels in a string with "99"
		ReplaceVowelsWith99.replaceVowels(str);

	}

}
