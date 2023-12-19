package com.learn.returnscocatedstringiftheyequal;

import java.util.Scanner;

public class ReturnsConcatedStringApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1 : ");
		String s1 = scan.nextLine();
		System.out.println("Enter the String2 : ");
		String s2 = scan.nextLine();
		
		String concated = ReturnsConcatedString.checkValuesOfString(s1, s2);
		System.out.println(concated);
	}

}
