import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();//user input
		int i=1,factorial=1;
		//until i becomes number value
		 while (i<=num)
		 {
			 factorial=factorial*i;//multiplying the factorial value with i and assigning the result in factorial
			 System.out.println(factorial);
			 i++;
		 }
		 //Displaying the output
		 System.out.println("The factorial of a Number is : "+factorial);
	}

}
