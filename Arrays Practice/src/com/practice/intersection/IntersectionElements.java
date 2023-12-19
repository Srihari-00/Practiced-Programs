package com.practice.intersection;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionElements {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Size of array 1");
		int size1 = scanner.nextInt();
		int[] array1 = new int[size1];
		System.out.println("Elements of array1");
		for (int i = 0; i < size1; i++) 
		{
			array1[i] = scanner.nextInt();
		}
		System.out.println("Size of array 2");
		int size2 = scanner.nextInt();
		System.out.println("Elements of array2");
		int[] array2 = new int[size2];
		for (int i = 0; i < size2; i++)
		{
			array2[i] = scanner.nextInt();
		}
		
		int[] intersection = findArrayIntersection(array1, array2);
		System.out.println(Arrays.toString(intersection));
	}
	
	private static int[] findArrayIntersection(int[] array1, int[] array2) 
	{
		Arrays.sort(array1);
		Arrays.sort(array2);
		int i = 0, j = 0, k = 0;
		int[] result = new int[Math.min(array1.length, array2.length)];
		while (i < array1.length && j < array2.length)
		{
			if (array1[i] == array2[j]) 
			{
				result[k++] = array1[i++];
				j++;
			}
			else if (array1[i] < array2[j]) 
			{
				i++;
			} 
			else 
			{
				j++;
			}
		}
		return Arrays.copyOf(result, k);

	}
}
