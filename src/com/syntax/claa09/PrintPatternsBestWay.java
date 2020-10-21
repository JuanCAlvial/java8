package com.syntax.claa09;

public class PrintPatternsBestWay {

	public static void main(String[] args) {

		for (int r=1; r<=4; r++) {
			for (int c=1; c<=6; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------6 rows 12 columns-------------------");
		
		for (int i=1; i<=6; i++) {
			for (int a =1; a<=12; a++) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println("-----------------12345--row4---col5---------");
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("-------------7rows and 6 columns---7654321------------");
		//7777777
		//6666666
		//5555555
		//4444444
		//3333333
		//2222222
		//1111111
		for (int i=7; i>=1; i--) {
			for (int j=0; j<=6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-----------------------------Square of numbers------------");
		for (int r=1; r<=5; r++) {
			for (int c=7; c>=1; c--) {
				System.out.print(c);
	}
			System.out.println();
}
}
}