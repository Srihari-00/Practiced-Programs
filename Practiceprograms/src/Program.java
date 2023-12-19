import java.util.Scanner;

class Program
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char ch=scan.next().charAt(0);
		int ind=scan.nextInt();
		
		char ch1[]=s.toCharArray();
		String newstr="";
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(i==ind)
			{
				newstr+=ch;
			}
			else
			{
				newstr+=ch1[i];
			}
		}
		System.out.println(newstr);
	}
	
}