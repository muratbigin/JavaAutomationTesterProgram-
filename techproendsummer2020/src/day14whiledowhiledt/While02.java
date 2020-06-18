package day14whiledowhiledt;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		
		/*
		 5)
      Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
      
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer");
		int fac =sc.nextInt();
		int fa =sc.nextInt();		
		
		int x =1;
		
		int count= 0;
		
		
		
		while(x<=fac && x<=fa ) {
			if(fac%x==0 && fa%x==0 ) {
				System.out.println(x);
				count++;
				
			}
			x++;
			
			
		}
		System.out.println("\n"  +count);
		
	
	}

}
