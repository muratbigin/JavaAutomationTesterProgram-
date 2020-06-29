package day21listsdt;

import java.util.Scanner;

public class MultiDimensionalArraysQuestions05 {

	public static void main(String[] args) {
		
		/*
		 5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
         For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study”
          output will be 14. Hint: Use split()
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your sentences");
		String str = sc.nextLine();
		System.out.println(str.split(" ").length);

	}

}
