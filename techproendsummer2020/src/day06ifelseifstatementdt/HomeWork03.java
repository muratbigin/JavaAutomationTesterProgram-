package day06ifelseifstatementdt;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		
		// Ask user to enter a character, then check whether the character is alphabet or not
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a character");
		char ch =sc.nextLine().charAt(0);
		
		if(ch <= 'a' && ch >= 'z' || ch <= 'A' && ch >= 'B'){
			System.out.println("This is an Alphabet.");
		} else {
			System.out.println("This is not an Alphabet.");
		}
		
		sc.close();
		

	}

}
