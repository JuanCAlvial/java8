package com.syntax.class10;

public class ArrayTask1 {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[0]+" and "+grade[1]);
		
		char[] grades= {'A','B','C','D','E','F'};
		
		System.out.println(grades[0]+" and "+grades[1]);
		
		System.out.println("----------------------------------------------");

		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		

	}

}
