package com.syntax.class03;

public class CompoundOperators {

	public static void main(String[] args) {
		
		int num=100;
		
		num=num+10;
		
		System.out.println(num); //num=110 bc value was reassigned
		
		num=num+200;
		System.out.println(num);//num=310
		
		//Shorter method to reassign value
		
		int myNumber=100;
		myNumber+=10;
		System.out.println(myNumber);//110
		
		myNumber+=200;
		System.out.println(myNumber);//310
		
		myNumber-=100;
		System.out.println(myNumber);//210
		
		myNumber/=10;
		System.out.println(myNumber);//21
		
		myNumber*=1000;
		System.out.println(myNumber);//21000
		
		myNumber%=100;
		System.out.println(myNumber);//0
		
		
		//Class exercise part 1
		
		
		int stepOne=10;
		stepOne+=100;
		
		System.out.println(stepOne);//110
		
		int var2=10;
		var2-=67;
		System.out.println(var2);//-57
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);//2
		
		int cake=25;
		cake%=7;
		System.out.println(cake);//remainder 4
				
				
				
		
				
				
				
		
		
		
		
		
		
		
	}
}
