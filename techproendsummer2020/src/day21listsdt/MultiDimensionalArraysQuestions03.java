package day21listsdt;

public class MultiDimensionalArraysQuestions03 {

	public static void main(String[] args) {

		/*
		 * 3) Find the sum of the elements whose indexes are same in the given two multi
		 * dimensional arrays arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = {
		 * {7,8,9},{10,11}, {12} }
		 * 
		 */

		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };
		
		int sum =0;

		for (int i = 0; i < arr1.length && i < arr2.length; i++) {
			for (int k = 0; k < arr1[i].length && k < arr2[i].length; k++) {
				sum+=(arr1[i][k]+arr2[i][k]);
			}

		}
		
		System.out.println(sum);

	}

}
