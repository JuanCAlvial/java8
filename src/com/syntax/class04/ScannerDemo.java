package com.syntax.class04;

import java.util.Scanner;
//shortcut to import Ctrl+shift+Alt

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=80;
		String str="I am a Striong";
		
		Scanner scan=new Scanner(System.in);// This line enables to the console*** REMEMBER THIS LINE
		// i am adding message to the user
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();// <--This l;ine waits for your input,and once u provide input hit ENTER
		System.out.println("I captured String value="+value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you"+name);
		
		
	}

}
