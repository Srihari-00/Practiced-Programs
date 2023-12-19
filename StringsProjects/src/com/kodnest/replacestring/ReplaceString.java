package com.kodnest.replacestring;

public class ReplaceString {

	public static void main(String[] args) 
	{
		String str = "KodNest Technologies Pvt Ltd";
		System.out.println(str);//Displaying the string str
		String newstr1 = str.replace('o', 'i');//replacing 'o' with 'i'
		System.out.println("The string after the replacement ");
		System.out.println(newstr1);//Displaying newstr1
		String newstr2 = str.replace('e', ' ');//replacing 'e' with a space
		System.out.println(newstr2);//Displaying newstr2
	}

}
