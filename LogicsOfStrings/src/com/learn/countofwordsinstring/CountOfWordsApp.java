package com.learn.countofwordsinstring;

import java.util.Scanner;

public class CountOfWordsApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();//taking the input from the user input
		//Calling the method which counts the no.of words and print them.
		CountOfWords.printCountOfWords(str);
		

	}

}
