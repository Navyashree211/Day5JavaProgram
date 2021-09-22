package com.bridgelabz.javabasic.program;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");   //User input:-- 2
		int n = InputUtility.getIntValue();
		
		Utility.power(n); 
		
	}
}
