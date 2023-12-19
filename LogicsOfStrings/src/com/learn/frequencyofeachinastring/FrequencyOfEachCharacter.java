package com.learn.frequencyofeachinastring;

public class FrequencyOfEachCharacter 
{
	static void checkFrequency(String x)
	{
		char []arr = x.toCharArray();
		int count=0;
		//String y ="";
		
		for(int i=0;i<=arr.length-1;i++)
		{
			/*char ch = x.charAt(i);
			if(!y.contains(x.charAt(i)+""))			
			{
				y=y+x.charAt(i);	
			}*/
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(x.charAt(i)+" : "+count);
			
		}
		//System.out.print(y);
		//System.out.println("The Frequency of character "+y+" is : "+count);
	}

}
