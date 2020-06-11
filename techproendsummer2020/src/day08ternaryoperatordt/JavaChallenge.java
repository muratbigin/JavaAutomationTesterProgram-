package day08ternaryoperatordt;

import java.util.Scanner;

public class JavaChallenge {

	public static void main(String[] args) {
		// User give 4 integers and program will check them
		//write on the console big number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First integer");
		int a = sc.nextInt();
		System.out.println("Second integer");
		int b = sc.nextInt();
		
		System.out.println("Third integer");
		int c = sc.nextInt();
		
		System.out.println("Fourth integer");
		int d = sc.nextInt();
		
		if (a > b && a > c  && a > d ) {
			System.out.println("big number  a: " + a);
		} else if (b > a && b > c  && b > d ) {
			System.out.println("big number  b: " + b);
			
		}else if (c > a && c > b  && c > d ) {
			System.out.println("big number  c: " + c);
		}else {
			System.out.println("big number  d: " + d);
		}
	}

}
