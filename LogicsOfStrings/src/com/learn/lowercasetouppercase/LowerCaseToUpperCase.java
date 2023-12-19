package com.learn.lowercasetouppercase;

public class LowerCaseToUpperCase 
{
	public static void convertLowerToUpper(String str)
	{
		System.out.println("The String after converting the Lower Case to UpperCase : ");
		char []arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)//i=index
		{
			int res=str.charAt(i);//storing the ASCII value of the char at index i of the string to the res
			if(res>=97 && res<=126)//checking for the lower case letters
			{
				int z=res-32;//subtracting 32 from the ASCII value of the char and storing it in z
				char ch = (char)z;//type casting from int to char type
				//Displaying the output
				System.out.print(ch);
			}
		}
	}

}
