package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please etnter a value");
		double mile=1.6;
		double kmFind = scan.nextDouble();
		System.out.println(kmFind*mile);
		scan.close();
	

	}

}
