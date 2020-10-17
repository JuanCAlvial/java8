package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {


		double money=5;
		double iceCream=5.59;
		
		if (money>=iceCream) {
			System.out.println("I am buying ice cream");
		}else {
			System.out.println("Sorry, no ice cream :(");
		}
		
		System.out.println("Iam code that executes without any condition");
		
		System.out.println("----------------------------------------------------------------------");
		
		//class assignment
		
		double d1=12.1;
		double d2=11.2;
		
		if (d1>d2) {
			System.out.println("Double value "+d1+" is larger than "+d2);
		}else {
			System.out.println("Double value "+d1+"is larger that"+d2);
		}
		
		//Temperature Check task
		 int temp1=50;
		 
		 if(temp1<32) {
			 System.out.println("Water will freeze with temperature" +temp1);
			 
		 }else {
			 System.out.println("water will NOT freeze with temperature"+temp1);
		 }
				
		 System.out.println("---------------------------------------------");
		 
		 boolean sleepy=false;
		 
		 //if not sleepy--> I will study otherwise i will take a nap
		 
		 if (sleepy==true) {
			 System.out.println("I will take nap");
		 } else {
			 System.out.println("i will study some java");
		 }
		
		
		System.out.println("------------------------------------------------");
		
		boolean hungry=true;
		
		if (hungry) {
			System.out.println("I will go eat");
		
		}else {
			System.out.println("I will continue studying");
		}
		
		
		
		
		
	}

}


