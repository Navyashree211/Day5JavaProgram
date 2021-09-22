package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class LargeOfThreeNumber {
	public static void main(String[] args) 
	  {
	    System.out.println("Enter the first number: ");
	    int num1 = InputUtility.getIntValue();
	    System.out.println("Enter the second number: ");
	    int num2 = InputUtility.getIntValue();
	    System.out.println("Enter the third number: ");
	    int num3 = InputUtility.getIntValue();
	    Utility.getLargeOfThreeNumber(num1, num2, num3);
	  }

}
