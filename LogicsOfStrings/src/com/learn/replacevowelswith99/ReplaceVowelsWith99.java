package com.learn.replacevowelswith99;

public class ReplaceVowelsWith99 
{
	static void replaceVowels(String s1)
	{
		String str="";
		char ch[]=s1.toCharArray();//converting the string into character type of array
		for(int i=0;i<=ch.length-1;i++)
		{
			//checking whether the character at index i is vowel or not
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' 
					|| ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				str+="99";//concatenating the 99 to the string
			}
			else
			{
				str+=ch[i];//concatenating the characters to the string
			}
		}
		//Displaying the String
		System.out.println(str);
	}

}
