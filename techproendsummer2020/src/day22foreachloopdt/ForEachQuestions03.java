package day22foreachloopdt;

import java.util.ArrayList;
import java.util.List;

public class ForEachQuestions03 {

	public static void main(String[] args) {
		
		
//		/*
//		 For-each Question 3:
//      Write a Java program to find the common elements between two arrays (string values).
//		 
//		 */
//		
//		
//		String arr1[] = {"aa","bb","cc"}, arr2[]= {"zz","bb","cc"};
//		
//		for(String i : arr1) {
//			for(String j: arr2) {
//				if(i==j) System.out.println(i);
//			}
//		}
		
		List<Integer> list = new ArrayList<>();

		list.add(21);

		list.add(22);

		list.add(23);
		
		
		int count=0;

		for(int w : list) {

			count++;

			if(count<3) {

				System.out.print(w + " ");	

			}	

		}	
		
		
		
		
		
		

	}

}
