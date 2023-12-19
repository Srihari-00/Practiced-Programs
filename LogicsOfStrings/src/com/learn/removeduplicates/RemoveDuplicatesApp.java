package com.learn.removeduplicates;

import java.util.Scanner;

public class RemoveDuplicatesApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();//Storing a string 
		//creating a immutable string
		String newstr="";
		//Displaying the original string
		System.out.println("The original string is : ");
		System.out.println(str);
		//Calling a method removes duplicates from the string
		RemoveDuplicates.checkForDuplicates(str,newstr);

	}

}
