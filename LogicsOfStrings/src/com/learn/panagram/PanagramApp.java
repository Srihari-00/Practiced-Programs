package com.learn.panagram;

import java.util.Scanner;

public class PanagramApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=scan.nextLine();
		
		System.out.println(Panagram.checkPanagram(s1));

	}

}
