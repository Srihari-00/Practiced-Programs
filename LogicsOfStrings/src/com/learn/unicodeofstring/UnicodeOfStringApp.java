package com.learn.unicodeofstring;

import java.util.Scanner;

public class UnicodeOfStringApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 = scan.nextLine();
		System.out.println("The Unicode of the String characters are : ");
		UnicodeOfString.printUnicodesOfChar(s1);
		

	}

}
