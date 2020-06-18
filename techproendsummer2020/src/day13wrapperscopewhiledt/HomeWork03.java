package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {

		/*
		 * 5) Type java code by using while loop, Write a program to count the factors
		 * of an integer which is entered by user.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int factor = sc.nextInt();
        int x =1, count=0;
		while (x<=factor) {
			
			if (factor % x == 0) {
			System.out.println(x);
			count++;
			}
			x++;
			
		}
		System.out.println(factor + " has "+ count +" factors");

		/*
		 * 6) Type java code by using while loop, Write a program that prompts the user
		 * to input an integer. It should then find sum of the digits of that number.
		 */
		System.out.println("enter an integer");
		
		int num = sc.nextInt(), i =0, sum =0;
		String convNum = Integer.toString(num);
		
		while(i<convNum.length()) {
			sum += Character.getNumericValue(convNum.charAt(i));
			i++;
		}
		System.out.println("the sum of digits: "+ sum);
		
		
		}

}
