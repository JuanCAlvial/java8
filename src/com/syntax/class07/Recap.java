package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {

		
		String month="January";
				//if month is dec-->feb-->winter
				//if month is march or april or may-->spring
				//
				
				switch(month) {
				case"December":
				case "January":
				case "February":
					System.out.println("Winter");
					break;
				case "March":
				case "April":
				case "May":
					System.out.println("Spring");
					break;
				}

	}
}