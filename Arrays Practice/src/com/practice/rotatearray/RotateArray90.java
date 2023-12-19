package com.practice.rotatearray;

import java.util.Scanner;

public class RotateArray90 {

	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		int[][] matrix = new int[size][size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		rotateImage(matrix);
		// Print the rotated matrix
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static void rotateImage(int[][] matrix) 
	{
		int size = matrix.length;
		// Transpose the matrix
		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// Reverse each row
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size / 2; j++) 
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][size - 1 - j];
				matrix[i][size - 1 - j] = temp;
			}
		}
	}
}
