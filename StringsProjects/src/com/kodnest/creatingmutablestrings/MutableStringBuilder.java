package com.kodnest.creatingmutablestrings;

public class MutableStringBuilder {

	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder();
		s1.append("User1 : Hi! ");//Assigning the String
		s1.append("User2 : Hello! ");
		s1.append("User1 : Wt are u doing? ");
		s1.append("I'm Learning Java, U also Learn the java.");
		//Displaying the string s1
		System.out.println(s1);

	}

}
