package com.learn.reverselettersofwords;

import java.util.Scanner;

public class ReverseLettersOfWordsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		System.out.println("The string before reversing of letters of words : ");
		System.out.println(str);
		
		ReverseLettersOfWords.printReverseOfLettersOfWords(str);

	}

}
