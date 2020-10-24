package com.syntax.class11;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		// new char[how many rows][how many columns];
		char[][] _array=new char [3][4];
		
		//add values to first row....
		_array[0][0]='A';
		_array[0][1]='B';
		_array[0][2]='C';
		_array[0][3]='D';
		
		//2nd row
		_array[1][0]='W';
		_array[1][1]='X';
		_array[1][2]='Y';
		_array[1][3]='Z';

		//3rd row
		_array[2][0]='Q';
		_array[2][1]='W';
		_array[2][2]='B';
		_array[2][3]='R';
		
		System.out.println(_array[1][3]);//Z
		
		System.out.println("________ANOTHER WAY TO CREATE A 2D ARRAY__________________");
		
		int[][] array= {
				{10,20,30},
				{1,2,3},
				{100,200,300},
				};
		
		System.out.println(array[2][1]);//200
		System.out.println(array[0][0]);//10
		System.out.println("The size of array integers = "+array.length);
		
		
	}

}
