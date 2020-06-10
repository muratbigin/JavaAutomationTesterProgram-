package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		
		
		
		/*
		 Type java code by using if-else and ternary. 
		 Ask user to enter two integers
        Write a program to print the minimum one on the console.
		 */

		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter two integer");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		//1.Way: if-else
		   
		  if(a<b) {
			  System.out.println(a);
		  }else {
			  System.out.println(b);
		  }
		  
		  
		  
		  int result = a<b ? a : b;
		  System.out.println(result);
		  
		  //Alternative 1.Way
		  
		  System.out.println(a<b ? a : b);
		  
		sc.close(); 

	}
	

}
