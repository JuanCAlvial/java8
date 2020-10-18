package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		/*ask user to pay for water
		 * water price is 5
		 * once use enters money we need to tell if we need more or less
		 * once user gives us exact 5 then enjoy your water
		 */
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for the water!");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if(money>waterPrice){
				System.out.println("This is too much, you need to enter less money");
				money=input.nextInt();
			}else {
				System.out.println("water is expensive, please insert more money");
				money=input.nextInt();
			}
		}
		
		System.out.println("Enjoy your water");
		
	}

}
