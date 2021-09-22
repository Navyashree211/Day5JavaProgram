package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) 
	{
	    System.out.println("Enter the number : ");
	    int number = InputUtility.getIntValue();
	    Utility.getFlipCoin(number);
	  }

}
