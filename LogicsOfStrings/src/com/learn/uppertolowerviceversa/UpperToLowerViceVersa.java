package com.learn.uppertolowerviceversa;

public class UpperToLowerViceVersa 
{
	static void convertsUppertoLower(String x)
	{
		System.out.println("The original string is : "+x);
		String result = "";
		for(int i=0;i<x.length();i++)
		{
			int res=x.charAt(i);//storing the ASCII value of the char in res
			//Converting UpperCase letters into LowerCase letters
			if(res>=65 && res <=96)//checking if the char is Upper or not
			{
				int z=res+32;//adding 32 to the ascii and storing it z
				char ch=(char)z;//explicit type casting int to char
				result+=ch;//adding the char to  the result and assigning to result
			}
			//Converting Lower Case letters into Upper Case letters
			else if(res>=97 && res<=126)//checking if the char is Lower or not
			{
				int z=res-32;//Subtracting 32 to the ascii and storing it z
				char ch=(char)z;//explicit type casting int to char
				result+=ch;//adding the char to  the result and assigning to result
			}
		}
		System.out.print(result);
	}

}
