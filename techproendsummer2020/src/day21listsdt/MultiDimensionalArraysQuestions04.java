package day21listsdt;

import java.util.Arrays;

public class MultiDimensionalArraysQuestions04 {

	public static void main(String[] args) {
		
		
		/*
		 4) Find the sum of the elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6,7} } and 
		 return an array. For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

		 */
		
		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
		int sum[]= new int[arr.length]; 
		for(int k=0; k<arr.length; k++) {
			for (int x=0; x<arr[k].length; x++) {
				sum[k]+=arr[k][x];
			}
			
		}
		
		System.out.println(Arrays.toString(sum));
		

	}

}
