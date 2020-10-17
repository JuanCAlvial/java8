package com.syntax.class04;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Variable for allergy -yes or no
		 * 
		 * if allergy is yes--> we will check if pet allergy if peanut allergy if pollen
		 * allergy if no allergy you are lucky!
		 */

		boolean allergy = false;
		boolean petAllergy = true;
		boolean peanutAllergy = false;
		boolean pollenAllergy = false;

		if (allergy) {
			System.out.println("Lets do further check");

			if (petAllergy) {
				System.out.println("Please no cats or dogs in the house");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}

		} else {
			System.out.println("You are lucky");
		}
		System.out.println("--------------------------EXAMPLE 2------------------------------------");

		/*
		 * if today is friday we will watch a movie but we ould like to check the date
		 *           -if the date is the 13th--->we will watch a scary movie
		 *           -if not the 13th --> we will watch a comdey movie
		 *   
		 * if its not friday-->i am studying          
		 */
		
		boolean isFriday=false;
		int date=4;
		boolean monday=true;
		
		if (isFriday) {
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch comdey movie with Adam Sandler");
			}
			
		}else {
			if(monday) {
				System.out.println("I am not studying, I am working");
			}else {
			
			System.out.println("Today is not friday, I am studying");
		}
		
		
	}
	
	System.out.println("------------------------------EXAMPLE 3-------------------------------------------");
	
	/*Check if assignment is completed
	 * if assignment is completed:
	 *           -if score is >90-->great job
	 *           _if score is >80-->good job
	 *           -is score is >70--> please study more
	 * 
	 */
	
	int score=79;
	boolean assignment=true;
	
	if (assignment) {
		
		if(score>90) {
			System.out.println("You did great!!!");
		}else if (score>80) {
			System.out.println("Youd did good!");
		}else {
			System.out.println("Nice trying but study more");
		}
		
	}else {
		System.out.println("You should always complete all assignments");
	}
	
	System.out.println("-----------------------------------------assignment-------------------------------------");
	
	boolean diploma=true;
	double gpa=4.0;
	
	if(diploma) {
		if(diploma) {
			System.out.println("Congrats!!!");
		 if (gpa>=3.5)	{
			System.out.println("You are eligible for a scholarship");
		}else {
			System.out.println("You should have studied harder");
		}
		
	
	}else {
		System.out.println("You should get a degree");
	}
	
	}	
	
	
	System.out.println("---------------------------Task2--------------------------------------");
	
	double mortgageRate=5;
	double mortgagePrice=10000;
	if (mortgageRate>4.5) {
		System.out.println("you shouldn't buy a house");
	}else if (mortgageRate<4.5) {
		System.out.println("you should consider to buy it");}
	if (mortgagePrice>2000000) {
		System.out.println("user will take a loan");
	}else if(mortgagePrice<=2000000) {
		System.out.println("use will pay cash");
		}
	}
	
	
	
	}
