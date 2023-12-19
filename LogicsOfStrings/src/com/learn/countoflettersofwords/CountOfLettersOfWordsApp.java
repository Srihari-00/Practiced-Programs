package com.learn.countoflettersofwords;

import java.util.Scanner;

public class CountOfLettersOfWordsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();//Reading the input from the user
		//Calling a method which performs the count of the letters present in words
		CountOfLettersOfWords.printCountOfLettersOfWords(str);
	}

}
