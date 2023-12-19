package com.learn.withoutusingsplitmethod;

import java.util.Scanner;

public class WithOutSplitMethodApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		
		WithOutSplitMethod.dontUseSplitMethod(str);

	}

}
