package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class ComputeQuotientAndRemainder {
	 public static void main(String[] args) 
	  {
	    System.out.println("Enter the value of the divisor: ");
	    int divisor = InputUtility.getIntValue();
	    System.out.println("Enter the value of the divisor: ");
	    int divident = InputUtility.getIntValue();
	    Utility.getComputeQuotientAndRemainder(divisor, divident);
	  }

}
