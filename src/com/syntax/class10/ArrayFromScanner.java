package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[]args) {
		
		//Lets ask how many names he would like to store and then store those names
		
		Scanner scan;
		String[] names;
		int size;
		
		scan=new Scanner(System.in);
		System.out.println("How many names would you like to store?");
		size=scan.nextInt();
		
		names=new String[size];//storing values into arrays
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();
		}
		//retrieving values from an array
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+" ");
		}
		
	}
}