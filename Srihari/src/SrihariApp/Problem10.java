package SrihariApp;
import java.util.*;
public class Problem10 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(1);
		
		int a = decodeCharacter(ch);
		System.out.println("The secret msg is : "+a);

	}
	public static int decodeCharacter(char x)
	{
		return x;
	}

}
