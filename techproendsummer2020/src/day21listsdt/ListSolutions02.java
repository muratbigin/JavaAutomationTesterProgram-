package day21listsdt;

import java.util.ArrayList;
import java.util.List;

public class ListSolutions02 {

	public static void main(String[] args) {
	 
		/*
		 2)By using add() with index method, add B into the 1st index.
         List elements should be like A, B, C, E, and F. Print it on the console
		 */
		
		List<Character> charL = new ArrayList<>();
		
		charL.add(0,'A');
		charL.add(1,'B');
		charL.add(2,'C');
		charL.add(3,'E');
		charL.add(4,'F');
		
		charL.add(0,'w');
		
		System.out.println(charL);

	}

}
