package com.bridgelabz.functionutility;

import java.util.Scanner;

public class FunctionUtility {

	static Scanner sc = new Scanner(System.in);
	
	public static int getInt()
	{
		return sc.nextInt();
	}
	// To make Two-D array
	public static int[][] getArrays() {
		System.out.println("Enter row");
		int n = FunctionUtility.getInt(); // take size of array to user

		System.out.println("Enter column");
		int m = FunctionUtility.getInt();
		int[][] ar = new int[n][m]; // Two-D array

		System.out.println("Enter " + n * m + " elements of array");
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = FunctionUtility.getInt();
			}
		}
		return ar;
	}

	public static void dispArrays(int[][] ar) {
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.println("ar"+"["+i+"]"+"["+j+"]"+"= "+ar[i][j]);
			}
		}
	}
	//Sum of three Array
	public static void SumOfThreeInteger()  {
		System.out.println("Enter numer");
		int n = FunctionUtility.getInt();
		
		int a[] = new int[n];
		System.out.println("Enter sum of three number");
		for (int i = 0; i < n; i++) {
			a[i] = FunctionUtility.getInt();
			
		}
		for (int i = 0; i < a.length - 1; i++) {
			
			for (int j =i+1; j < a.length -1; j++)  {
				
				for (int k =j+1; k < a.length; k++) {
					
					if (a[i] + a[j] + a[k] == 0) {
						
						System.out.println("Sum of these --->" +a[i] + a[j] + a[k]);
					}
				}
			}
		}
		
	} 
	

}
