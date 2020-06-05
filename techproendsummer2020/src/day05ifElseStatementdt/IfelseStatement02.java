package day05ifElseStatementdt;

import java.util.Scanner;

public class IfelseStatement02 {

	public static void main(String[] args) {
		/*
		 Ask user to give you a char
		 If the char is same with your initial of your first name
		 print  "You got it!" on the console.
		 Otherwise print "Try again!" on the console.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me ab char to uppercase");
		char initial = sc.nextLine().charAt(0);
		
		if (initial=='S') {
			System.out.println("You got it!");
		}else {
			System.out.println("Try again!");
		}
		
		sc.close();

	}

}
