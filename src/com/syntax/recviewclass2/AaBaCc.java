package com.syntax.recviewclass2;
import java.util.Scanner;
public class AaBaCc {
	public static void main (String[]args){
	    Scanner scan=new Scanner(System.in);
	    String grade=null;
	    System.out.println("Please enter your mark");
	    int score=scan.nextInt();
	    if(score>1 && score<25){
	      grade="F";
	    }else if(score>25 && score<45){
	      grade="E";
	    }else if(score>45 && score<50){
	      grade="D";
	    }else if(score>50 && score<60){
	      grade="C";
	    }else if(score>60 && score<80){
	      grade="B";
	    }else if(score>80){
	      grade="A";
	    System.out.println("Your grade is " +score);
	    }else{
	      System.out.println("Please enter valid mark");
	  }
	}
	}