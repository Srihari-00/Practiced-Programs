import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the person's age : ");
		Citizen pr = new Citizen();
		int age = scan.nextInt();
		
		pr.Discount(age);

	}

}
