import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) 
	{
		//Creating the object of the scanner class
		Scanner scan = new Scanner(System.in);
		//asking the user to enter input
		System.out.println("Enter a number : ");
		//accepting the input from the user
		int num = scan.nextInt();
		//Prime pr = new Prime()
		
		if(num%1!=0 && num%num!=0)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
		

	}

}
