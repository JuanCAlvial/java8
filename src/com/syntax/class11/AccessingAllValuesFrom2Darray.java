package com.syntax.class11;

public class AccessingAllValuesFrom2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(_array.length);
		
		for(int row=0; row<_array.length; row++) {//loops through rows
		
			for(int col=0; col<_array[row].length; col++) {
				
				System.out.print(_array[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		int[][] array= {
				{10,20,30},
				{1,2,3},
				{100,200,300},
				};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
