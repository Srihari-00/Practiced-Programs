package com.learn.uppertolowerviceversa;

import java.util.Scanner;

public class UpperToLowerViveVersaApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();//Storing a string
		//Calling a method which performs converting Lower to higher case vice-versa
		UpperToLowerViceVersa.convertsUppertoLower(str);

	}

}
