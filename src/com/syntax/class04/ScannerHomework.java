package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomework {

	public static void main(String[] args) {

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is amount for loan");
		
		int loan=input.nextInt();
		
		if(loan<=200000) {
			System.out.println("I will lend the money");
		}else {
			System.out.println("I will not lend you the money");	
			}
		
		System.out.println("--------------------------Task 2-----------------------");
		/*You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver licence to them,
		 * otherwise you will offer them to get a learners permit 
		 */
		
		System.out.println("How old are you?");
		
		int age= input.nextInt();
		
		if(age>=18) {
			System.out.println("I will issue you a drivers license.");
		}else {
			System.out.println("I offer you a learners permit");
		}
		System.out.println("----------------------Task 3------------------------------------");
		
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		System.out.println("Input your citys' name");
		String city;
		city=input.next();
		
		System.out.println("Input your temperature");
		float f;
		f=input.nextFloat();
		
		double cel;
		cel=(f-32)/1.8;
		
		System.out.println(" The temperature in the city "+city+" is "+cel);
		
	}

}
