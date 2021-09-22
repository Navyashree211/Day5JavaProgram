package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter first argument : ");
		double t = InputUtility.getIntValue();
		
		System.out.println("Enter first argument : ");
		double v = InputUtility.getIntValue();
		Utility.getWindChill(t, v);
	}
      
}
