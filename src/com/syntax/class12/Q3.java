package com.syntax.class12;

public class Q3 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series
		
		int num1 = 0;
		int num2 = 1;
		int sum;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;	

	}

	}
}
