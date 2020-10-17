package com.syntax.class06;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3, max;
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		scanner.close();
		
		// 1st way
		if (num1 > num2 && num1 > num3) {
			max =num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println(max);
		
		
		// 2nd way
		if (num1 > num2) {//if number 1 larger than number2
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println(max);
	}
}
	
