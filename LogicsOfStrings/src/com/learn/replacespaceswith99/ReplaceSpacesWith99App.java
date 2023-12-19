package com.learn.replacespaceswith99;

import java.util.Scanner;

public class ReplaceSpacesWith99App {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		
		ReplaceSpacesWith99.replaceSpace(str);

	}

}
