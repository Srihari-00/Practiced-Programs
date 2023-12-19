package SrihariApp;
import java.util.*;

public class Semester
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks semester1  : ");
		int sem1 = scan.nextInt();
		System.out.println("Enter the marks semester2  : ");
		int sem2 = scan.nextInt();
		System.out.println("Enter the marks semester3  : ");
		int sem3 = scan.nextInt();
		System.out.println("Enter the marks semester4  : ");
		int sem4 = scan.nextInt();
		System.out.println("Enter the marks semester5  : ");
		int sem5 = scan.nextInt();
		System.out.println("Enter the marks semester6  : ");
		int sem6 = scan.nextInt();
		System.out.println("Enter the marks semester7  : ");
		int sem7 = scan.nextInt();
		System.out.println("Enter the marks semester8  : ");
		int sem8 = scan.nextInt();
		
		float Average = SemesterAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.println("The average of 8 semesters is : "+Average);

	}
	public static float SemesterAverage(int x, int y, int z, int a,int s, int d, int f, int g)
	{
		return (x+y+z+a+s+d+f+g)/8 ;
	}

}
