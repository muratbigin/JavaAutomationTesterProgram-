package day09nestedternarydt;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 Type java code by using nested ternary.
      Write a program to check if a year is leap year or not.
      If the year is divisible by 100 then it must be divisible by 400.
      If a year is not divisible by 100 then it must be divisible by 4.
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year.");
		int year = sc.nextInt();

		String result = (year%100==0) ? (year%400==0 ? "Leap" : "Not Leap") : 
			   (year%4==0 ? "Leap" : "Not Leap");
		System.out.println(result);
		
		sc.close();
	}

}
