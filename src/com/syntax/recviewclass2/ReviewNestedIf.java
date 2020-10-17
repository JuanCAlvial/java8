package com.syntax.recviewclass2;

public class ReviewNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Juan";
		String pass="pass123";
		double acctBalance=10.25;
		double transferAmount=8;
		boolean transAllowed=true;
		
		if(pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank "+name);
			if(transAllowed) {
				System.out.println("Initiating transfer");
			}else {
				System.out.println("You are allowed to transfer");
			}
		}else {
			System.out.println("Invalid credentials please try again");
		}
				
				
		
		
	}

}
