package com.syntax.class06;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {

		/*
		 * Lets ask a tester on which browser they would like to use
		 * 
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch(browser.toLowerCase()){
			
			case "safari":
				message="You code will be executed on safari browser";
				break;
			case "chrome":
				message="You code will be executed on chrome browser";
				break;
			case "firefox":
				message="You code will be executed on firefox browser";
				break;
			default:
				message="Enter browser is not supported";
				
		}
				
		System.out.println(message);
		
	
		//switch cannot work with double, float, long
		
		float f=10.99f;
		double d=19.90;
		long l=19099;
		boolean b=true;
		
		switch(f)//complier error cannot switch on a value of long, double, or float
		
	}

}
