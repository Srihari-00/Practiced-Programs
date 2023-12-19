package ccom.learn.convertsuppercasetolowercaseletters;

import java.util.Scanner;

public class UpperCaseToLowerCaseApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();//storing a string
		//Displaying the original string
		System.out.println("The original String is : "+str);
		//calling a method which performs converting the upper case letters to lower case letters
		UpperCaseToLowerCase.convertToLowerCase(str);

	}

}
