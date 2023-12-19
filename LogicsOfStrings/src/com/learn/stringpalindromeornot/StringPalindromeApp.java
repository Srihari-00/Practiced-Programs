package com.learn.stringpalindromeornot;

import java.util.Scanner;

public class StringPalindromeApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = scan.nextLine();//Storing a string
		//calling a method which performs checking palindrome or not
		StringPalindrome.checkStringPalindrome(s1);
	}

}
