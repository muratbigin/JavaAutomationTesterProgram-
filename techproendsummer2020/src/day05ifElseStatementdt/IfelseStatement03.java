package day05ifElseStatementdt;

import java.util.Scanner;

public class IfelseStatement03 {

	public static void main(String[] args) {
		/*
		   Ask user to give you the quantity of the products and the 
		   unit price of the product.
		   if the quantity is more than 1000, print "You got 10% discount" and print 
		   the total price on the console
		   Otherwise, print "No discount" and print the total price on the console.
		   
		 */
	// this is my solution	
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me quantity of the products");
		int quan = sc.nextInt();
		
		if (quan > 1000) {
			System.out.println("You got 10% discount " + (quan/100*10) + " Euro");
		}else {
			System.out.println("No discount");
		}
		
		
		// Suleyman's solution (this is very important)
		
		
		// Ask user to give you the quantity of the products and the 
		// unit price of the product.
		// If the quantity is more than 1000, print "You got 10% discount" and print
		// the total price on the console.
		// Otherwise, print "No discount" and print the total price on the console
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Give me quantity");
			int quantity = scan.nextInt();
			System.out.println("Give me unit price");
			int unitPrice = scan.nextInt();
			
			//In math operations, if you use more than 1 data type
			//Java will return the result in the widest data type.
			if(quantity>1000) {
				System.out.println("You got 10% discount");
				System.out.println(0.9*unitPrice*quantity);
			}else {
				System.out.println("No discount");
				System.out.println(unitPrice*quantity);
			}
			scan.close();
		
		
		
		sc.close();
		
		
		

	}

}
