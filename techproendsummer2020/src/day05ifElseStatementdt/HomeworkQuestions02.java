package day05ifElseStatementdt;

import java.util.Scanner;

public class HomeworkQuestions02 {

	public static void main(String[] args) {
	
		
		/*
		 i did all homework in the day05_if_logicals package.....
		 teacher was doing in the homework02day04 class question 
		 
		 */

		
		/*
		 Type java code by using if statement. When you enter the initial 
		 of the day of a week, output should be all possible names of the days.
	     For example; if the initial is ’S’ output should be “Saturday or Sunday” 
		 Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		*/	
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the initial of a day in uppercases");
			//To get char from user you have to use "nextLine().charAt(0)"
			char initialOfDay = scan.nextLine().charAt(0);
			
			if(initialOfDay=='S') {
				System.out.println("Sunday or Saturday");
			}
			if(initialOfDay=='M') {
				System.out.println("Monday");
			}
			if(initialOfDay=='T') {
				System.out.println("Tuesday or Thursday");
			}
			if(initialOfDay=='W') {
				System.out.println("Wednesday");
			}
			if(initialOfDay=='F') {
				System.out.println("Friday");
			}
			scan.close();
		}
	
	}


