package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		
		/*
		 3)
     Type java code by using while loop,
     Write a program that prompts the user to input a positive integer.
     It should then print the multiplication table of that number.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		int positive = sc.nextInt();
		positive=Math.abs(positive); // (Math.abs()) makes the numbers positive.		
		int i =1;
		
		while(i<11) {
		System.out.println(positive*(i++));
		}
		
		
		
		/*
		 4) Type java code by using while loop,
         Write a program that prompts the user to input a positive integer.
          It should then print factorial of that number.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a integer.");
		int f = sc.nextInt();
		int toplam=1;
		
		int k=1;
		while(k<=f) {
			
			toplam=toplam*k;
			k++;
		}
		System.out.println(toplam);
		
		
		//2.Way
		
		int multi =scan.nextInt();
		multi= Math.abs(multi);
		int sum =1;
		for(int a =1; a <=multi; a++) {
			
			sum*=a;
			
		}
		
		System.out.println(sum);
		
		
		
		
//		int multi =scan.nextInt();
//		multi= Math.abs(multi);
//		int sum =1;
//		for(int a =1; multi >=a; multi--) {
//			
//			sum*=multi;
//			
//		}
//		System.out.println(sum);
		
		//3.Way 
		
		int minus = scan.nextInt();
		
		int sum2=1;
		
		while(minus>=1) {
		sum2*=minus;
		minus--;
		}
		System.out.println("nbnbn" + sum2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
