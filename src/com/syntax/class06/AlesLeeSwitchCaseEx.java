package com.syntax.class06;

public class AlesLeeSwitchCaseEx {

	public static void main(String[] args) {
		/*Find a day of the week
		 * number 1-7
		 * find day 3
		 */
		
		
		int day=3;
		
		switch(day) {// if variable (day) is equal to system.out.println("Value")
		
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Not a valid day number");
			
			
		
		}

	}

}
