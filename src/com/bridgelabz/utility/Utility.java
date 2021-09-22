package com.bridgelabz.utility;

public class Utility {

//Even or Odd
	public static void getEvenOdd(int number) {

		if (number % 2 == 0) {
			System.out.println("Entered Number is Even");
		} else {
			System.out.println("Entered Number is odd");
		}

	}

	// Harmonic Number
	public static void getHarmonicNumber(int number) {
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber = harmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + "" + harmonicNumber);
	}

	// Leap Year
	public static void getLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { // if year is evenly divisible by 4 , 100 or
																			// 400 then
			System.out.println("Specified year is a leap year"); // we should getting leap year otherwise it is not a
																	// leap year.
		} else {
			System.out.println("Specified year is not a leap year");
		}
	}

	// Swapping Two Number

	public static void getSwappingTwoNumber(int number1, int number2) {
		int temp;

		// swapping in steps
		temp = number1;
		number1 = number2;
		number2 = temp;

		// verify swapped values
		System.out.println("number1 = " + number1 + " and number2 = " + number2);
	}

	// Flip Coin
	public static void getFlipCoin(int number) {
		double head = 0, percentHead = 0, tail = 0, percentTail = 0;
		for (int i = 0; i < number; i++) {
			double flip = (double) Math.random();
			if (flip < 0.5) {
				System.out.println("Result of flip coin is Tail");

				percentTail = flip * 100 / number;
				System.out.println("Percentage of tail is : " + percentTail);

			} else {
				System.out.println("Result of flip coin is Head");
				System.out.println("Percentage of head is : " + (100 - percentTail));
			}
		}
	}

	// Prime Factors
	// A function to print all prime factors of a given number
	public static void getPrimeFactors(int number) {
		for (int i = 2; i < number; i++) {
			while (number % i == 0) { // factor
				System.out.println(i + " ");
				number = number / i; // prime number
			}
		}
		// this condition is to handle the case when
		// n is a prime number greater than 2

		if (number > 2) {
			System.out.println(number);
		}
	}

	// Power of two
	// function find the power of a number
	public static void power(int n) { // n=2
		int j = (int) Math.pow(2, n); // 2 pow 2 => j=> 4
		// 2
		System.out.println(2 + "to the power " + n + "is:" + j);

		int k = 2;
		System.out.println("Entering PowerOfTwo Program");

		if (n >= 0 && n < 31) { // n=2
			while (k > j) { // k=2, j=4, 2<4 ,,,,, 4>4
				k = k * 2;
			}
			System.out.println("Given value is Power of range is 0-30 ");
		} else {
			System.out.println("Invalid Range Please Enter Power of Range is 0-30 ");
		}

	}

	// vowel or consonant
	public static void getVowelOrConsonant(String s) {

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("vowel       : " + ch);
			} else {
				System.out.println("consonant  : " + ch);
			}

		}
	}
	// Large of three number

	public static void getLargeOfThreeNumber(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println("First number is largest");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println("Second number is largest");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("Third number is largest");
		} else {
			System.out.println("None of the elements are greater");
		}
	}

	// Compute quotient and remainder
	public static void getComputeQuotientAndRemainder(int divisor, int divident) {

		int quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println("Quotient value:" + quotient);
		System.out.println("Remaider value:" + remainder);
	}
      // Distance program
	public static double getDistance(int x, int y) {     // x=2, y=2
	
		System.out.println("Entering Distance program");
		// 2,2    //2,2
		double d = Math.pow(x, x) + Math.pow(y, y);
		System.out.println("print value of d: " +d);  //x=4, y=4 ==> d=>8
		
		return Math.sqrt(d);
		
	}
       //Quadratic program
	public static double getQuadratic(int a, int b, int c) {
		System.out.println("Entering Quadratic program");
		double delta = (Math.pow(b, 2)) -4 * a * c;
		System.out.println(delta);
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("Root1 value:" + root1);
		System.out.println("Root1 value:" + root2);
		return -1;
	}
         //Wind Chill
	public static double getWindChill(double t, double v) {
      
		System.out.println("Entering WindChill Program");
		double w = 35.75 + 0.6215 * t + (0.4275 * t -35.75) * Math.pow(v, 0.16);
		System.out.println(w);
		return w;
	}
}