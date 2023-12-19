package com.learn.upperlowercasecount;

import java.util.Scanner;

public class CountUppercaseLowercaseApp 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = scan.nextLine();//Storing a string
		//calling a method which performs counting of Upper case and Lower case letters in a string
		CountUppercaseLowercase.countUpperAndLowercaseLetters(s1);	
	}
}
