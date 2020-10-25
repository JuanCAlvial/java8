package com.syntax.class12;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
//write a java program to find the second largest number in array
		
		double[] num1 = {1,5,3,6};
		int length=num1.length;
		Arrays.sort(num1);
		System.out.println("Second highest number is "+num1[length-2]);
		
	}

}
