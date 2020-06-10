package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
	  
		/*
		 Type java code by using if-else and ternary, ask user to enter an integer, 
		 If the integer is even, the output will be “The integer is even”. 
		 If the integer is odd, the output will be “The integer is odd”.
		*/

		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter an integer");
		  int a = sc.nextInt();
		//1.Way: if-else
		   
		  if(a%2==0) {
			  System.out.println("The integer is even");
		  }else {
			  System.out.println("The integer is odd");
		  }
		  
		  
		  
		  String result = a%2==0 ? "The integer is even" : "The integer is odd";
		  System.out.println(result);
		  
		  //Alternative 1.Way
		  
		  System.out.println(a%2==0 ? "The integer is even" : "The integer is odd");
		  
		 
		 sc.close(); 
		  
	}

}
