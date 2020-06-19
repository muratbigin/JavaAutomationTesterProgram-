package myWorks01;

import java.util.Scanner;

public class Slide11Question08 {

	public static void main(String[] args) {
		
		
		/*
		8) Ask user ta enter his/her first name, last name and Social Security Number. Then type a program which makes
		a) initials of the first name and the last name in uppercase,
		other characters will be in lowercase.
		b) all characters except last 4 characters of the Social Security Number “ * ”.
		For example; Suleyman Alptekin *****5678
        */
		
		Scanner sc =new Scanner(System.in);
		System.out.println("First name");
		String fName = sc.next();
		System.out.println("Last name");
		String lName = sc.next();
		System.out.println("Social Security Number");
		String ssn = sc.next();
		
		
		
		String firstChFName = fName.substring(0, 1).toUpperCase();
		String firstChLName = lName.substring(0, 1).toUpperCase();
		String hideSsn = "****" + ssn.substring(4,ssn.length());
		
		fName =fName.replaceFirst(fName.substring(0, 1), firstChFName);
		lName= lName.replaceFirst(lName.substring(0, 1), firstChLName);
		
		System.out.println(fName + " " + lName + " " + hideSsn);
				
	
	}

}
