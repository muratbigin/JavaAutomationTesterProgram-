package day05ifElseStatementdt;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
//		 we get from user three numbers.
//		java writes big number on the console.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number");
		int secondNum = sc.nextInt();
		System.out.println("Enter third number");
		int thirdNum = sc.nextInt();
		
		
		if(firstNum>secondNum && firstNum > thirdNum) {
			
				System.out.println("Big number is: " + firstNum);
			}else if (secondNum > thirdNum) {
				System.out.println("Big number is: " + secondNum);
			}else {
				System.out.println("Big number is: " + thirdNum);
			}
		
        sc.close();
	}

}
