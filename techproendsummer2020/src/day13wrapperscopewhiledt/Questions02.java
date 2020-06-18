package day13wrapperscopewhiledt;

import java.util.Scanner;

public class Questions02 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word which has 4 characters");
		String str = sc.nextLine();
		
		char ch4 = str.charAt(3);
		char ch3 = str.charAt(2);
		char ch2 = str.charAt(1);
		char ch1 = str.charAt(0);
		
		System.out.println("" + ch4 + ch3 + ch2 + ch1); // KRAM
		
		sc.close();

	}

}
