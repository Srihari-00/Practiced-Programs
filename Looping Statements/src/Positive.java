import java.util.Scanner;

public class Positive 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		Negative pr = new Negative();
		int a = scan.nextInt();
		
		pr.Check(a);

	}

}
