package com.syntax.class05;

import java.util.Scanner;

public class ClassTask3 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		 * short (under 60 inch)
		 * medium(between 60 -72 inch)
		 * tall (over 72 inch)
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please eneter height in inches");
		
		int height=scan.nextInt();
		if(height<60) {
			System.out.println("You are short");
		}else if(height>=60 && height<=72){
			System.out.println("You are medium height");
		}else if(height>72) {
			System.out.println("You are tall");
		}else {
			System.out.println("You are noothig");
		}
		
		System.out.println("-----------------------------------------------task2--------------------------------------");
		/*Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 - output “It is a weekday”, 
		 * anyday from 6-7 - output “It is a weekend”, 
		 * any other day - output “Invalid day” 
		 */
		int day;
		
		System.out.println("Enter day of the week (1-7)");
		
		day=scan.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
	}

}
