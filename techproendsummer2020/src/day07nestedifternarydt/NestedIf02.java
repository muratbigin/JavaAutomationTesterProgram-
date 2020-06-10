package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf02 {

	
//	Type java code by using nested if statement,
	//If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
	//“Perfect even number” otherwise, the output will be “Good even number.”
	//If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
	//“Perfect odd number” otherwise, the output will be "Good even odd"
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number"); 
        int number = sc.nextInt();
        
        
        if (number %2  == 0 ) {
        	if (number%3 ==  0) {
        		System.out.println("Perfect even number");
        	}else {
        		System.out.println("Good even number");
        	}
        	
        }else if (number %2 !=0) {
        	if (number %3 ==0) {
        		System.out.println("Perfect odd number");
        	}else {
        		System.out.println("Good even odd");
        	}
        	
        	
        	//alptejkin solutions
        	
        	
//        	if(a%2==0) {
//    			
//    			if(a%3==0) {
//    				System.out.println("Perfect even number");
//    			}else {
//    				System.out.println("Good even number");
//    			}
//    ​
//    		}else {
//    			
//    			if(a%3==0) {
//    				System.out.println("Perfect odd number");
//    			}else {
//    				System.out.println("Good odd number");
//    			}	
//    		}
//
//        	
        	
        	sc.close();
        	
        }
        	
        

        
	}

}
