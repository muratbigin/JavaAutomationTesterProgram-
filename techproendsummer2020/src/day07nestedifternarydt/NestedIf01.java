package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter gender and age.
		 if the gender is "male" and the age is less than 20 print "Boy"
		 Otherwise print "Man" on the console.
		 If the gender is "female" and the age is less than 20 print "Girl"
		 otherwise print "Women" on the console.
		 */
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your gender");
        //if you want to convert all characters in a String to lower case use toLowerCase()
      //if you want to convert all characters in a String to upper case use toUpperCase()
        String gender = sc.next();
        System.out.println("Please, enter your age"); 
        int age = sc.nextInt();
        
        if (gender.equalsIgnoreCase("Male")) {
        	if (age < 20) {
        		System.out.println("Boy");
        	}else {
        		System.out.println("Man");
        	}
        	
        }else if (gender.equalsIgnoreCase("female")) {
        	if (age < 20) {
        		System.out.println("Girl");
        	}else {
        		System.out.println("Women");
        	}
        	
        }else {
        	System.out.println("Undefind Gender");
        	
        }
        sc.close();
	}

}
