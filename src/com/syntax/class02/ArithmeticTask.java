package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		
		// Task 1           
		
	double num1=1.9;
	double num2=2.1;
	
	double add=num1+num2;
	double sub=num1-num2;
	double mult=num1*num2;
	double div=num1/num2;
	
	System.out.println("The addition of 2 number " + num1 + " and " + num2 + " is equal to " + (num1+num2));
	System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1-num2));
	System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1*num2));
	System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1/num2));		
	
	// Task 2
		double val=3.9;
		double squared=val*val;
		
		System.out.println("The square of the " +val+ " is "+squared);
		
		//Task 3
		
		int width=5;
		int height=8;
		int area=(height*width);
		int per= (2*(height*width));
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+area+" and the area is " +per);
		
				

	}

}
