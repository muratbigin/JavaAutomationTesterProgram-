package day21listsdt;

import java.util.ArrayList;
import java.util.List;

public class ListSolutions01 {

	public static void main(String[] args) {
		
		
		/*
		 1)Create a String list whose elements are A, C, E, and F. Print it on the console.
		 */
		
		 List<String> strList = new ArrayList<>();
		 String arr[] = {"A","B","C","E","F"};
		 for (String i : arr) {  // 
			 strList.add(i);
		 }
		 System.out.println(strList);
		 
//		 List<String> strList2 = new ArrayList<>();
//		 strList2.addAll(strList);
		
		
		
		

	}

}
