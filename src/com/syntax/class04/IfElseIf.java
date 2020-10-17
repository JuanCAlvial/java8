package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
		/*
		 * we need to compare 2 numbers:
		 * bigger, smaller or equal
		 */

		int num1=19;
		int num2=99;
		
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		/*Based on the day of the week we will print class schedule
		 * 
		 */
		int day=7;
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if (day==2){
			System.out.println("Today is Tuesday we have manual class");
		}else if (day==3) {
			System.out.println("Today is Wednesdayand we have a Manual class again");
		}else if (day==4) {
			System.out.println("Today is Thursday and we have Review class");
		}else if(day==5) {
			System.out.println("Today is Friday but O have class toorrow and I will prepare");
		}else if(day==6) {
			System.out.println("Today is saturday, i miss jave classes");
		}else if (day==7) {
			System.out.println("today is sunday, i did a lot of coding");
		}else {
			System.out.println("this is invalid day of week");
		}

	System.out.println("-----------------------------------------------------------------------------------");
	
	
	 //Create a Java program and declare int variable that will hold a month. Based on the value of the variable your program should print the name of the month.
	 
	
	int month = 8;
	if (month == 1) {
		System.out.println("January");
	} else if (month == 2) {
		System.out.println("February");
	} else if (month == 3) {
		System.out.println("March");
	}else if (month == 4) {
		System.out.println("April");
	}else if (month == 5) {
		System.out.println("May");
	}else if (month == 6) {
		System.out.println("June");
	}else if (month == 7) {
		System.out.println("July");
	}else if (month == 8) {
		System.out.println("August");
	}else if (month == 9) {
		System.out.println("September");
	}else if (month == 10) {
		System.out.println("October");
	}else if (month == 11) {
		System.out.println("November");
	}else if (month == 12) {
		System.out.println("December");
	}else {
		System.out.println("Invalid month");
	}
	System.out.println("--------------------------------------------------------------------------------------------------------------");
	//Write a program to check whether number is positive or negative.
	
	int num = -3;
	if (num > 0) {
		System.out.println("The number is a positive number.");
	} else if (num < 0) {
		System.out.println("The number is a negative number.");
	} else {
		System.out.println("The number is zero.");
	}
	System.out.println("-------------------------------------------------------------------------------------------------");
	
	//Write a Java Program to check whether number is Even or Odd.
	int num4=4;
	if (num4%2==0) {
		System.out.println("The number is evem");
	}else {
		System.out.println("the number is odd");
	}
	
	}


}
