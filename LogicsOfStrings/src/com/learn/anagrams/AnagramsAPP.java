package com.learn.anagrams;

import java.util.Scanner;

public class AnagramsAPP {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = scan.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = scan.nextLine();

		String result = Anagram.checkAnagram(str1, str2);
		System.out.println(result);
	}

}
