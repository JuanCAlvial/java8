package com.youtube.alexlee;

public class DoWhileLoops {

	public static void main(String[] args) {
		//NewBoston
		// While loops had a test condition, if its true it would print the body,
		// Do While loop will execute body at least once before it even checks if it true or false
		
		//write Do statement first then while condition

		int i=0;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		
		System.out.println("-------------------False-------");
		//Because statement is false, it will only print once
		int counter=15;
		
		do {
			System.out.println(counter);
		}while (counter<=10);
		
	}

}
