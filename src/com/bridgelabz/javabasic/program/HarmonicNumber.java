package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	 public static void main(String[] args) 
	  {
	    System.out.println("Enter the number to check the harmonic number : ");
	    int number = InputUtility.getIntValue();
	    Utility.getHarmonicNumber(number);
	  }

}
