package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter hours...");
		
		long hours = scan.nextLong();
		System.out.println(hours*Math.pow(60,2));
		scan.close();
	}

}
