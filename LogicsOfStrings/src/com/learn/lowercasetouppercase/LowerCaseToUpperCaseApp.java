package com.learn.lowercasetouppercase;

import java.util.Scanner;

public class LowerCaseToUpperCaseApp {

	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.nextLine();//Storing the string
		//Displaying the original string
		System.out.println("The original string is : "+str);
		//Calling a method which performs converting of the LowerCase to the Upper case
		LowerCaseToUpperCase.convertLowerToUpper(str);

	}

}
