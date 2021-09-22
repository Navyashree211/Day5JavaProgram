package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		int a = InputUtility.getIntValue();
		System.out.println("Enter the second number: ");
		int b = InputUtility.getIntValue();
		System.out.println("Enter the third number: ");
		int c = InputUtility.getIntValue();
		Utility.getQuadratic(a, b, c);
	}
}
