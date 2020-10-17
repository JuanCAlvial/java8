package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberTask {

	public static void main(String[] args) {
		//play the lottery where we need to enter number from 1 to 100
				//lucky number is 7
				//Keep asking a user to enter a number until they enter a lucky number
		
		Scanner scan;
		int numberFromUser;
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 100");
			numberFromUser=scan.nextInt();
			
		}while(numberFromUser!=luckyNumber);
		
		System.out.println("You guessed the number right");
		
		
	}

}
