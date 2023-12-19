import java.util.Scanner;

public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		Grades pr = new Grades();
		int marks = scan.nextInt();
		
		pr.Pass(marks);

	}

}
