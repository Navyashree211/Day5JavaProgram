package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter the number to check even or odd: ");
		int number = InputUtility.getIntValue();
		Utility.getEvenOdd(number);
	}

}
