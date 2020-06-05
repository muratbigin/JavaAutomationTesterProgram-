package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter side lengts of the triangle");
		byte a =scan.nextByte();
	    byte b =scan.nextByte();
	    byte c =scan.nextByte();
		System.out.println(a + b + c);
		scan.close();

	}

}
