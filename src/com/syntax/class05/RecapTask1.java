package com.syntax.class05;

import java.util.Scanner;

public class RecapTask1 {

	public static void main(String[] args) {
		
		Scanner scan;
		String answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please eneter if you have a credit card(true/false)");
		
		answer=scan.next();
		
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your card?");
			balance=scan.nextDouble();
			
			if(balance>1000) {
				System.out.println("Please pay off your card balance");
			}else {
				System.out.println("You can spend more $$");
			}
		}else {
			System.out.println("Would you like a credit card?");
		}

	}

}
