package com.practice.quizs;

public class Quiz1 {

	public static void main(String... haha) 
	{
		if (haha.length == 0) 
		{
			System.out.println("No arguments");
		} 
		else
		{
			System.out.println("Arguments are:");
			for (String hehe : haha) 
			{
				System.out.println(hehe);
			}
		}

	}
}