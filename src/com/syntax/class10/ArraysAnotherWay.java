package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {

		String[] names= {"Juan","Gaby","Danny","Miguel","Mulu","Elias"};
		
		System.out.println(names[3]);//output will be "Miguel'
		
		//how do you know how many elements i have in the array
		int size=names.length;//names.length list how many values
		System.out.println("Size of names in array = "+size);
		
		System.out.println(names[names.length-2]);// means 5-2 answer is Miguel
		
		int a=2;
		
		System.out.println(names[a]); //answer is danny
		
		a+=2;
		System.out.println(names[a]);//Mulu
		System.out.println("-------------------------------------");
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}

	}

}
