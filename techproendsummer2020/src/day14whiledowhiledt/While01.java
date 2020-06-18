package day14whiledowhiledt;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		
		/*
		 4) Type java code by using while loop,
       Write a program that prompts the user to input a positive integer.
       It should then print factorial of that number.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//1.Way by using for-loop
		
		int product =1;
		
		for(int i=1; i<=num; i++) {
			product*=i;
		}
		
		System.out.println(product);
		
		
		//2.Way by using  while loop
		
		int prdct=1;
		int k=1;
		
		while(k<=num) {
			prdct=prdct*k;
			k++;
		}
		
		
		System.out.println(prdct);
		
		
		
		
		
		
		
		

	}

}
