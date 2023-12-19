package Palindrome;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//creating the scanner class 
		System.out.println("Enter a number : ");//asking the user to enter the input
		int num = scan.nextInt();//storing the user input in num variable
		Palindrome pr = new Palindrome();//creating the object of the another class
		
		pr.checkPalindrome(num);//calling the method of another class using its object
		
	}

}
