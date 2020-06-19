package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		
		
		
		
		
Scanner sc = new Scanner(System.in);
		
		int i = 1;		
		do {
			
			System.out.println("Enter a number");
			i = sc.nextInt();	
		}while(i%2!=0);

		System.out.println("Won!");
		
		sc.close();

		

	}

}
