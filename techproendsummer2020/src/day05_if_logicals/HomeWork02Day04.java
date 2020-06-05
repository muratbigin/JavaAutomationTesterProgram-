package day05_if_logicals;

import java.util.Scanner;

public class HomeWork02Day04 {

	public static void main(String[] args) {


//		2)Type java code by using if statement. When you enter the initial of the day of a week, 
//		output should be all possible names of the days.
//		For example; if the initial is ’S’ output should be “Saturday or Sunday”

		//			Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		
			char nameDaysOfWeeks = 'S';
			if(nameDaysOfWeeks=='S') {
				System.out.println("Saturday or Sunday");
				
			}	if(nameDaysOfWeeks=='T') {
				System.out.println("Tuesday or Thursday");
				
			}  if(nameDaysOfWeeks=='M') {
				  System.out.println("Monday");
				
			}if(nameDaysOfWeeks=='W') {
				System.out.println("Wednesday");
				
			}if(nameDaysOfWeeks=='F') {
				System.out.println("Friday");
				
	         }
// second way; teacher did 				
		
		
		
		
		
//		3) Type java code by using if statement. When you enter the name of the day
//		of a week, output will be “Weekday” or “Weekend day” according to the name of
//	     the day.
	
		String dayOfWeeks = "Sunday";
		
		if (dayOfWeeks.equals("Saturday") || dayOfWeeks.equals("Sunday")){
			System.out.println("Weekend Days");	
		} else {
			System.out.println("Weekend");
		}

	
	
	
	
	
    	/*
	 4) Ask user to enter the values of length and width of a rectangle, 
then check if it is square or not.
		 */
		
		
		
		Scanner sc1 = new Scanner(System.in); 
		System.out.println("Enter the values of length and width of a rectangle");
		int length = sc1.nextInt();
		int width = sc1.nextInt();
		
		
		if(length == width) {
			System.out.println("it is a square");
			
		}else {
			System.out.println("it is a not square ");
		}
		
		sc1.close();
		
	}
}
		


