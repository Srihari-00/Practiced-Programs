import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		//Scanner class object is created
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");//Asking the user to give the  input
		int num = scan.nextInt();//Accepting the input from user
		//Creating an object of another class
		FactorialofNumber pr = new FactorialofNumber();
		
		//calling the method by using the object of another class
		pr.factorialofaNumber(num);

	}

}
