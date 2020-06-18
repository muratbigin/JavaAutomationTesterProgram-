package myWorks01;

import java.util.Scanner;

public class Slide11Question07 {

	public static void main(String[] args) {
		
		/*
		 7) Ask user to enter password, if the password is okay for the following 
		 conditions output will be “Your password is created successfully.” If the password 
		 is not okay for any of the following conditions Output will be “Enter a new password 
		 according to the give conditions”
         1.First letter must be uppercase 
         2.Last letter must be lowercase 
         3.Password must contain 6 characters

		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Emnter distance");
		String password = sc.next();
		int lengthOfPass = password.length();
		String firstCh = password.substring(0, 1);
		String lastCh =  password.substring(lengthOfPass-1,lengthOfPass);
		
		boolean upCase = (firstCh == firstCh.toUpperCase());
		boolean lowCase = (lastCh == lastCh.toLowerCase());
		boolean lengthCh = (lengthOfPass == 6);
		
		if(upCase && lowCase && lengthCh) {
			System.out.println("Your password is create successfully.");
		}else {
			System.out.println("Enter a new password according to the give condition.");
		}
		
		

	}

}
