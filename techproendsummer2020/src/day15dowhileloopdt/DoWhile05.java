package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
	
		
		/*
		 Ask user to enter his/her first name 
		 if the initial is lower case print a message like "Make the initial upper case"
		 if the initial is upper case print a message like "You did it right"
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		String firstName = "";
		
		
		do {
			System.out.println("Enter your first name");
			firstName = sc.next();
			
			if(firstName.charAt(0)>='a' && firstName.charAt(0)<='z') {
			System.out.println("Make the initial upper case");
			}
		}while(!(firstName.charAt(0)>='A' && firstName.charAt(0)<='Z'));
		
		System.out.println("You did it right");
		
		sc.close();

	}

}
