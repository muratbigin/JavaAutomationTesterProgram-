package day05_if_logicals;

import java.util.Scanner;

public class WarmUp4 {

	public static void main(String[] args) {
	
		
		/*
		  
           WARM UP 4 (10 minutes)
1) Create a package, and name it as “day05_if_logicals”
2) Create a class, and name it as “WarmUp4”
3) Ask user ta enter a 4 digits integer, then print the sum of the first and the last digit of the number on console.
For example; if user enters 1234 you will add 1 and 4,
then print on the console 5
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a 4 digits  value");
		int num1 =scan.nextInt();
		
		System.out.println(num1/1000 + (num1%10));
		
		scan.close();
		

 }
}
