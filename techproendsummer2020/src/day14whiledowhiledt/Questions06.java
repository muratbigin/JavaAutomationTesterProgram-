package day14whiledowhiledt;

import java.util.Scanner;

public class Questions06 {

	public static void main(String[] args) {
		
		
		/*
		 6.Ask user to enter a name. If the name contains the letter ‘a’ then print
		 * "Won!" on the console otherwise ask user to enter another name. Use do-while
		 * loop
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a name");

		String name = "";
		boolean isContain = false;
		do {
			name = scan.next();
			isContain = name.contains("a");
			if (!isContain) {
				System.out.println("enter another name");
			}
		} while (!isContain);

		System.out.println("won!!");

		scan.close();
	   
	   
	}

}
