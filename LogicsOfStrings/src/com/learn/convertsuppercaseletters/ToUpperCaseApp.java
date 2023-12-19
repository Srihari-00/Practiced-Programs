package com.learn.convertsuppercaseletters;

import java.util.Scanner;

public class ToUpperCaseApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = scan.nextLine();
		
		ToUpperCase.convertToUppercase(str);

	}

}
