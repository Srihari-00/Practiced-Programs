import java.util.Scanner;

public class Vote {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age : ");
		Voter pr = new Voter();
		int age = scan.nextInt();
		
		pr.voting(age);
		
	}

}
