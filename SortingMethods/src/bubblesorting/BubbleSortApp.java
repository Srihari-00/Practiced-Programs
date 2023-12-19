package bubblesorting;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array : ");
		//Creating the Array and Asking its length
		int [] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to be stored into the Array : ");
		//Storing the elements into the Array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before sorting : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		//Calling the Bubble sort Method
		BubbleSort.bubbleSorting(arr);

	}

}
