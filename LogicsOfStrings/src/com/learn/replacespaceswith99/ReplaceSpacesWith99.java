package com.learn.replacespaceswith99;

public class ReplaceSpacesWith99 
{
	static void replaceSpace(String x)
	{
		/*String s=x.replace(" ","99");
		System.out.println(s);*/
		char [] arr = x.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			char res=x.charAt(i);
			if(res==' ')
			{
				//res+='9';
				arr[i]='9';
			}
		}
		String str=arr.toString();
		
		System.out.println(str);
	}

}
