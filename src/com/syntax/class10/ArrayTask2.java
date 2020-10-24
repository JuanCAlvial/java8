package com.syntax.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[] cars= {"porsche","subaru","scion","honda","kia","jeep"};
		
		for (int a=0; a<cars.length; a++) {
			System.out.print(cars[a]+" ");
		}
		System.out.println();
		
		System.out.println("getting values from array using enhanced for loop");
		/*
		 * for(:name of array)
		 */
		for(String car:cars) {
			System.out.println(car+" ");
		}
		System.out.println();
		
		System.out.println("-------------------------------getting values from using enhanced loop-----------------");
		
		int[] numbers= {10,10,90,600,89};
		
		for(int num :numbers) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("-----------------getting values from array enhanced for loop--------------");
		
		boolean[] arrayOfBoolean= {true, true, false, true};
		
		for(boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
		
	}

}
