package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=12/7;
		System.out.println(d);//1.0
		
		double e=9;//widening
		System.out.println(e);//9.0
		//double data type will change value into decimal
		
		int i=(int)9.99;//narrowing
		System.out.println(i);//9
		
			byte b=(byte)130;
			System.out.println(b);//-126
		

	}

}
