package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		//ASk user to enter an integer 
		//if the integer is greater than 10 print"Good"on the console
		//otherwise print "Bad"on the console
		
		//1.Way : use if-else statement to solve
		
	  Scanner sc = new Scanner(System.in);
  	  System.out.println("Enter an integer");
  	  
  	  int i = sc.nextInt();
  	  
//  	  if(i >10 ){
//  		  System.out.println("Good");
//  	  }else {
//  		  System.out.println("Bad10");
//  	  }
//  	  2.Way: Use ternary operator to solve
  	  
  	   String result = i>10 ? "Good" : "Bad";
  	     System.out.println(result);
  	     
  	     sc.close();
	}

}
