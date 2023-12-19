package com.learn.frequencyofeachinastring;

import java.util.Scanner;

public class FrequencyOfEachCharacterApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		System.out.println("Enter a character to check its frequency : ");
		//char ch = scan.next().charAt(0);
		System.out.println("The String is : "+str);
		
		FrequencyOfEachCharacter.checkFrequency(str);

	}

}
