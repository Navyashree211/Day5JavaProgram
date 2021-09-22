package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {
	public static void main(String[] args) 
	  {
	    System.out.println("Enter a number : ");
	    int number = InputUtility.getIntValue();
	    Utility.getPrimeFactors(number);
	  }

}
