package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		//to capture a sentence
		System.out.println("Please enter any sentence");
		String sentences=scanner.nextLine();
		System.out.println("You entered sentence: "+sentences);
		
		//to capture number
		System.out.println("please enter any number");
		int number=scanner.nextInt();
		System.out.println("You entered number "+number);
		
		//to capture 1 word
		System.out.println("please enter any word");
		String word=scanner.next();
		System.out.println("You enteres number: "+number);
		
		//to capture 1 character
		System.out.println("please enter any single character");
		char singleCharacter=scanner.next().charAt(0);
		System.out.println("You entered number; "+singleCharacter);
		

	}

}
