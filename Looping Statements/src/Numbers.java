import java.util.Scanner;

public class Numbers {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		Checking pr = new Checking();
		int num = scan.nextInt();
		
		pr.Check(num);
		
	}

}
