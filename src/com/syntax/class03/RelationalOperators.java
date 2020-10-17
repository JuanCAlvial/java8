package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {


		int a=10;
		int b=15;
		
		System.out.println(a>b);//false
		System.out.println(a<b);//true
	    System.out.println(a==b);//false 
	    System.out.println(a!=b);//true
	    
	    int x=100;
	    int y=90;
	    
	    boolean result=x>y;
	    System.out.println(result);//true
	    
	    result=x==y;
	    System.out.println(result);
	    
	    System.out.println(x==y);//boolean
	    System.out.println(x=y);//90--assigned value of y to x
	    System.out.println(x);//90
	    
	    boolean result1=x==y;
	    System.out.println(result1);//true
	    
	    
	    byte num=10;
	    byte num1=11;
	    
	    boolean boo=num>num1;//false
	    System.out.println(boo);
		
	}

}
