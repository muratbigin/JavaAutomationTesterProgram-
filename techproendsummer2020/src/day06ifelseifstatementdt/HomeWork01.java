package day06ifelseifstatementdt;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		
//		Questions...
//		 Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
//		 else output will be “No need to work”
//		 we have done on the lesson
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
	
		
		  if(age < 0 ) {
				System.out.println("come on what is your problem");
		  }else if(age <=13) {
			System.out.println("Should not work");
		
		}else if (age>65){
			System.out.println("Retired");
			
		}else {
			System.out.println("Should Work");
			}	
	  
sc.close();	


	}

}
