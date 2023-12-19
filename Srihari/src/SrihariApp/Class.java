package SrihariApp;
import java.util.Scanner;

public class Class {

    public static void main(String []args)
    {   
    long num1;
    long num2;
    long sum;

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a num 1");
    num1 =sc.nextLong();

    System.out.println("Enter num2");
    num2 =sc.nextLong();

    sum = galacticAddition(num1, num2);
        System.out.println(sum);

    }    
    


public static long galacticAddition(long a, long b)
{
long c= a+b;
    

return c;
}
}