package com.syntax.class05;
import java.util.Scanner;

public class Task5 {


		public static void main(String[] args) {
			Scanner scan;
			String month;
			String season;
			
			scan = new Scanner(System.in);
			System.out.println("Please, enter your birth month");
			month=scan.next();
			
			if(month.equals("June")||month.equals("July")||month.equals("August")) {
				season="Summer";
			} else if (month.equals("September")||month.equals("October")||month.equals("November")) {
				season="Fall";
			} else if (month.equals("December")||month.equals("January")||month.equals("February")) {
				season="Winter";
			} else if (month.equals("March")||month.equals("April")||month.equals("May")) {
				season="Spring";
			}
			
			System.out.println("You were born in "+season);
		}

	
	}


