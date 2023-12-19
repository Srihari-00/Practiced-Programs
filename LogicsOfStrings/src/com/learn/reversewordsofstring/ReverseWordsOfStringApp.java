package com.learn.reversewordsofstring;

import java.util.Scanner;

public class ReverseWordsOfStringApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scan.nextLine();//Storing a string
		//displaying the original string
		System.out.println("The original string is : ");
		System.out.println(str);
		//calling a method  which performs reversing the order of the words and storing in a new string
		String newstr= new String(ReverseWordsOfString.printReverseWords(str));
		//displaying the new string
		System.out.println("After Reverse ordered of words of String is : ");
		System.out.println(newstr);
	}

}
