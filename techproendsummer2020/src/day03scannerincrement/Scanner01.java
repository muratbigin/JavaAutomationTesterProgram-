package day03scannerincrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
//		How to get String from user
		
//		Step1
//		instead of "red underline"tell Java is complaining	or	
//		"Compile Time Error"
		Scanner scan = new Scanner(System.in);

//		Step 2
		
		System.out.println("Please give me your full name");
		
//		Step 3
//		if we use next(); Java will return just the first word in the  String
//		if we use nextLine(); Java will return all string
		
//		String fullName = scan.next();
		
		String fullName = scan.nextLine();
		System.out.println(fullName);
		scan.close();

	}

}
