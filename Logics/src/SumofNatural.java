import java.util.Scanner;

public class SumofNatural {

	public static void main(String[] args)
	{
		//creating the object of scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");//asking the user to enter the input
		SumofNumbers pr = new SumofNumbers();//Creating the object of another class
		int num = scan.nextInt();
		
		pr.SumofFirstNaturalNumbers(num);

	}

}
