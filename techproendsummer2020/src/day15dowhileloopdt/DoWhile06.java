package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print "Long name"
		 otherwise print "Normal name" and finish the loop
		 */
		
		
Scanner sc = new Scanner(System.in);
		
		String longName = "";
		
		
		do {
			System.out.println("Enter your first name");
			longName = sc.next();
			
			if(longName.length() > 6) {
			System.out.println("Long name");
			}
		}while((longName.length() > 6));
		
		System.out.println("Normal Name");
		
		sc.close();

	}

}
