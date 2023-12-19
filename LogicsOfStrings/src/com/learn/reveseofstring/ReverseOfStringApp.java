package com.learn.reveseofstring;

import java.util.Scanner;

public class ReverseOfStringApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = scan.nextLine();//String a string
		//calling a method which reverses the string
		ReverseOfString.printReversedString(s1);

	}

}
