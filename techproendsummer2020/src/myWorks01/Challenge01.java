package myWorks01;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please, enter number");
	int num = sc.nextInt();
	
	if (num > 99 || num <10 ) {
		System.out.println("Just 2 digit");
	}else {
		System.out.println((num/10)+(num%10));
	}
	
		
	}

}
