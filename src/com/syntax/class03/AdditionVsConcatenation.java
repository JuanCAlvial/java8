package com.syntax.class03;

public class AdditionVsConcatenation {
	
	public static void main(String[] args) {
		//type main ctrl+space for main to pop up
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Friends";
		
		System.out.println(a+b+x+y); //300HelloFriends
		System.out.println(a+x+b+y);//100Hello200Friends
		System.out.println(x+y+a+b);//HelloFriends100200
		//When you start with a String all toher variables are taken as Strings
		//When you start with a number it will treat it as math
		
		System.out.println(x+y+(a+b));
		
				
		
		
		
		
	}

}
