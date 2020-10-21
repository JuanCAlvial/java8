package com.youtube.alexlee;

public class BreakandContinueKeywords {

	public static void main(String[] args) {
		// break keyword breaks out of loop
		
		for(int i=0; i<100; i++) {
			System.out.println(i);
			if(i==7) {
				break;
			}
		}

		System.out.println("---------------Continue----------");
		//Best way to think of continue statement is 'skip'
		
		for(int i=0; i<100; i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
	}

}
