package day05_if_logicals;

import java.util.Scanner;

public class HomeWorkDay04 {
	public static void main(String[] args) {

//	1) Type java code, if an integer is even, output will be 
//	“The integer is even”.
//	If the integer is odd, output will be “The integer is odd”.

		Scanner sc = new Scanner(System.in);

    	System.out.println("write a number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The integer is odd");
		} else {
			System.out.println("The integer is even");
		}
		sc.close();

    
	
		

	}
}
