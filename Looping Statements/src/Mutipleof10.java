import java.util.Scanner;

public class Mutipleof10 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		Multiple pr = new Multiple();
		int num = scan.nextInt();
		
		pr.Check(num);

	}

}
