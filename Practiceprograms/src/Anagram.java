import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		boolean res=checkAnagram(s1,s2);
		if(res)
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}	
	static boolean checkAnagram(String s1, String s2)
	{
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		char ch1[]=s3.toCharArray();
		char ch2[]=s4.toCharArray();
		//Arrays.sort(ch1);
		//Arrays.sort(ch2);
		char temp;
		for(int i=0;i<=ch1.length-1;i++)
        {
            for(int j=0;j<=ch1.length-i-2;j++)
            {
                if(ch1[j]>=ch1[j+1])
                {
                    temp=ch1[j];
                    ch1[j]=ch1[j+1];
                    ch1[j+1]=temp;
                }
            }
        }
		for(int i=0;i<=ch2.length-1;i++)
        {
            for(int j=0;j<=ch2.length-i-2;j++)
            {
                if(ch2[j]>=ch2[j+1])
                {
                    temp=ch2[j];
                    ch2[j]=ch2[j+1];
                    ch2[j+1]=temp;
                }
            }
        }
		String newstr1 = new String(ch1);
		String newstr2 = new String(ch2);
		
		if(newstr1.equals(newstr2))
		{
			return true;
		}
		return false;
	}

}
