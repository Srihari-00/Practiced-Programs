import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) 
	{
		//creating the scanner class 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");//asking the user input
		//taking the number
		int num=scan.nextInt();
		//asking the user input
		System.out.println("Enter the power to calculate : ");
		//taking the power
		int power=scan.nextInt();
		//creating the object of another class
		Powers pr = new Powers();
		
		//using the object of another class, calling the method
		//storing the method returned value in result
		int result=pr.calci(num,power);
		//Printing
		System.out.println(num+"^"+power+"="+result);
		

	}

}
