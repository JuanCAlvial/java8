package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// I want to print numbers from 1to 5 except number 3
		
		for(int i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
System.out.println("End of loop");
System.out.println("----------------------------------");
// I want to print numbers from 1 to 1o number 3 and 7

	for(int i=7; i<=10; i++) {
		if(i==3 || i==7) {
			continue;
		}
		System.out.println(i);
	}
	
	}

}
