package com.learn.possiblesubstring;

import java.util.Scanner;

public class PossibleSubStringsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=scan.nextLine();
		//calling the method which prints all the possible sub-strings
		PossibleSubStrings.printAllSubStrings(str);

	}

}
