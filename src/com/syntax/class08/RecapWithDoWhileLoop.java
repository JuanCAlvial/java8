package com.syntax.class08;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RecapWithDoWhileLoop {

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
		System.out.println("Please pay for your water!");
		money=input.nextInt();
		
		do {
			if(money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
			}else if(money<waterPrice){
				System.out.println("Water is expensive, please insert more money");
			}
		}while(money!=waterPrice);
		System.out.println("Enjoy your water");
		
	}

}
