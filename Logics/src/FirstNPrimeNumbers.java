import java.util.Scanner;

public class FirstNPrimeNumbers {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		PrimeNumbers pr = new PrimeNumbers();
		
		pr.firstNPrimeNumbers(num);

	}

}
