package bubblesorting;

public class BubbleSort
{
	public static void bubbleSorting(int arr[])//accepting the parameters 
	{
		//Displaying the Array Before Sorting
		System.out.println("The Array Before Sorting : ");
		for(int x:arr)//using Enhanced For loop
		{
			System.out.print(x+" ");
		}
		System.out.println();
		int temp;
		//where i = No.of Iterations
		for(int i=0;i<=arr.length-1;i++)
		{
			//where j=Indexes
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//Performing the swapping operation
				if(arr[j]>=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//Displaying the Array after Sorting
		System.out.println("The Array After Sorting : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
	}

}
