package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
	  
//	Step 1
		
		Scanner scan = new Scanner(System.in);

//	Step 2 			
 
	    System.out.println("Please enter radius of the circle");
	    
//	Step 3 
	    
	    float radius = scan.nextFloat();
	    float pi=(float) Math.PI;
	    System.out.println(pi*Math.pow(radius, 2));
	    System.out.println(Math.pow(radius, 2));
	    System.out.println(pi*radius*radius);
	    System.out.println(2*pi*radius);
		scan.close();
		
	}

}
