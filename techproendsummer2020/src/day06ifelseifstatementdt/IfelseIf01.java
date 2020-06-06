package day06ifelseifstatementdt;

import java.util.Scanner;

public class IfelseIf01 {

	public static void main(String[] args) {
		
//ask user to enter an integer
//If the number is greater than 0 print "Positive" on the console
//If the number is less than 0 print "Negative" on the console
//If the number is equal than 0 print "Neutral" on the console	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int a = sc.nextInt();
		
		if(a > 0) {
			
			System.out.println("Positive");
		}else if (a < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Neutral");
		}
		sc.close();
		

//		if you want you can use else if() for every condition
		
       if(a > 0) {
			
			System.out.println("Positive");
		}else if (a < 0) {
			System.out.println("Negative");
		}else if (a==0){
			System.out.println("Neutral");
		}

       
//   if you are sure the last condition covers all other possibilities  
//		you can use just else instead of else if()
       
       if(a > 0) {
			
			System.out.println("Positive");
		}else if (a < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Neutral");
		}
	}

}
