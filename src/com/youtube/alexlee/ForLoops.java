package com.youtube.alexlee;

public class ForLoops {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {//i<10 determines you will run code for 10
			System.out.println("I love dogs!");//will output "i Love dogs 10!" times
	}
		for (int i=0; i<=15; i++) {
			System.out.println(i);//i<15 will output 0-14....i<=15 will print out 1-15
		}
		
		int [] grades= {98,100,83,90,93};
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			
		}
		
	
	System.out.println("------------Newboston example BEST------------------");
	         //Takes three arguments, 
			//1 where we wants statement to start,
			//2 where we want loop to end,
			//3 how much to increment by, i++ goes by one at a time 1,2,3,4,5 etc, i+=3... 1,4,7,10
	
	
	for (int counter=1; counter<=10; counter++) {
		System.out.println(counter);
	}
	
	}	
	
}