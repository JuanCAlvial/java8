package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {
		String day= "Saturday";
		
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class");//1
		}
		while(day.equals("Saturday")) {
			System.out.println("My favorite Java class");//infinite times
			day="Sunday";
		}
		
		
		
		System.out.println("__-----------");
	boolean isItBreakTime=true;

	if(isItBreakTime) {
		System.out.println("I will get tea");
	}
	while (isItBreakTime) {
		System.out.println("I will get some tea");
		isItBreakTime=false;
	}
		
		
	}
	}


