package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		// create an array of countries.
		//while retrieving all values from an array print capital for each country(2 different loops)
		
		String[] countries= {"USA", "UKRAINE", "CANADA"};
		String[] capitals= {"DC", "KYIV", "Ottawa"};
		
		for(int v=0; v<countries.length; v++) {
			System.out.println("The capitoal of "+countries[v]+" is "+capitals[v]);
		}
		System.out.println("-----------------------------------------------------");
		
		String capital;
		
		for(String country:countries) {
			switch(country) {
			case"USA":
				capital="DC";
				break;
			case"UKRAINE":
				capital="KIEV";
				break;
			case "CANADA":
				capital="Ottawa";
				break;
				default:
					capital="IDK";
			}
			System.out.println("capital of the "+country+" is "+capital);
		}
		

	}

}
