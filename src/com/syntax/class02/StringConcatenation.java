package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String name=" Juan";
		
		//I would like to say : My name is Juan
		
		System.out.println("My name is"+name);
		
		String lastName="Alvial";
		
		//I would like to print Juan Alvial
		
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		
		//Juan lives in Miami
		
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//Juan is B student
		
		System.out.println(name+" is "+grade+" student ");
		
		int age=21;
		//Juan is 21 years old
		
		System.out.println(name+" is "+age+" years old");
		//to attach/concatenate ANY value (char, int,String, double)
		//to a String we use + (String concatenation operator)
		
		int date=27;
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState="DC ";
		// above String are not equal, state has 2 characters and anotherState has 3 characters
		System.out.println(anotherState);
		
		
		
	}

}
