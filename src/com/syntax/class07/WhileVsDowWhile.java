package com.syntax.class07;

public class WhileVsDowWhile {

	public static void main(String[] args) {
		System.out.println("------------------------WHILE LOOP--------------------------------");
		int a=10;
		//first we check condition
		while(a<15) {
			System.out.println("Hello");
			a++;
		}

		System.out.println("---------------------------DO WHILE------------------------------------");
		int b=10;
		//first do something
		do {
			System.out.println("Hi");
			b++;
		}while(b<15);//then check condition
		
	}

}
