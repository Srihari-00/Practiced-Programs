package com.learn.checklengthofstrings;

import java.util.Scanner;

public class LengthOfStringsApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String s1 = scan.nextLine();
		System.out.println("Enter String2 : ");
		String s2 = scan.nextLine();
		
		LengthOfStrings.checkLengthOfTwoStrings(s1, s2);
		

	}

}
