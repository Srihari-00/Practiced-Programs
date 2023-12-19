package com.learn.table;

import java.util.Scanner;

public class TableByRecursionApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		
		TableByRecursion.printTable(num,1);

	}

}
