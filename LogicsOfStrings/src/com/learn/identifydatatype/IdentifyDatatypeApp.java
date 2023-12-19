package com.learn.identifydatatype;

import java.util.Scanner;

public class IdentifyDatatypeApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();//Reading the string from the user
		//calling the ,Method which identifies the character
		IdentifyDatatype.checkDatatypes(str);
	}

}
