package ccom.learn.convertsuppercasetolowercaseletters;

public class UpperCaseToLowerCase
{
	static void convertToLowerCase(String x)
	{
		char arr[]=x.toCharArray();//Converting the string into a character type array
		System.out.println("The String after converting the UpperCase to LowerCase letters : ");
		for(int i=0;i<=arr.length-1;i++)//i= index of the array
		{
			int res=x.charAt(i);//Storing the ASCII value of the character present at index i
			if(res>=65 && res<=96)//checking for the UpperCase letters
			{
				int z=res+32;//Adding 32 to the ASCII value of the letter
				char ch=(char)z;//type casting from int to char
				//Displaying the character
				System.out.print(ch);
			}
		}		
		
		
		
	}

}
