package com.youtube.alexlee;

public class Pattern {

	public static void main(String[] args) {
		
		for (int i=0; i<3; i++) {// will run code for 3 times and print 3 *s. determines how many rows there are(top to bottom)
			for (int j=0; j<5; j++) {// will run code 5 times and print columns.
				System.out.print("*");//has to print, if its println it will print incorrectly
			}
			System.out.println();//output for row
		}
		System.out.println("---------------------------------------");
		
		for (int i=1; i<=5; i++) {// 
			for (int j=0; j<i; j++) {//j is the column and i is the row, which means j is less than i 
				System.out.print("*");//has to print, if its println it will print incorrectly
			}
			System.out.println();//output for row, we want want seperate lines
	}
		for (int i=4; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

}
}