package com.learn.preservespacereversestring;

import java.util.Scanner;

public class PreserveSpaceRevApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		
		System.out.println(PreserveSpaceRev.reverseStringPreservingSpaces(str));
	}

}
