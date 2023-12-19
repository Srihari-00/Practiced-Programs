package productofoddnumbers;

import java.util.Scanner;

public class ProductofFirstoddnumbersApp {

	public static void main(String[] args) 
	{
		//creating the scanner class 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();//accepting the input from the user
		//creating the object of the another class
		ProductofFirstOddnumbers pr = new ProductofFirstOddnumbers();
		
		pr.productofOddNumbers(num);//calling the method using the object of another class
	}

}
