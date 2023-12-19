package com.kodnest.lengthofstring;

import java.util.Scanner;

public class LengthofString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string value : ");
		String str = scan.nextLine();//Accepting a string value
		//System.out.println(str);
		//Displaying the length of the string
		System.out.println("The length of the string is "+str.length());

	}

}
