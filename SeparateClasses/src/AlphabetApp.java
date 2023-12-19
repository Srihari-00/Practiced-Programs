import java.util.*;
public class AlphabetApp
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Alphabet ab = new Alphabet();
		System.out.println("Enter the value : ");
		char a = scan.next().charAt(0);
		
		ab.Check(a);
		
	}

}
