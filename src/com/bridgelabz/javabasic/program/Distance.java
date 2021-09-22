package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter value of x");
		  int x = InputUtility.getIntValue();
		  
		  System.out.println("Enter value of y");
		  int y = InputUtility.getIntValue();
		  
		    Utility.getDistance(x, y);
	}

}
