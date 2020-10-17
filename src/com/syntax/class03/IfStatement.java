package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		int num1=180;
		int num2=900;
		
		System.out.println("writing my first if statement");
		
	
		if(num1>num2) {
			System.out.println("num1 is bigger than num2");
		}


	System.out.println("End of if statement");	
		
	System.out.println("-----------------------------------------------------------------------------");

	int temp=60;
	
	if (temp>80) {
		System.out.println("Iam going to the beach");
}else {
	System.out.println("i will go for a walk");
}
	
	System.out.println("--------------------------------------------------------------------------");
	
	double expectedHours=15; //true
	double actualHours=8;
	
	if(actualHours>expectedHours) {
		System.out.println("You will love the course and you will succeed");
	}else {
		System.out.println("Course will be to hard for you");
	}
	
	}

}
