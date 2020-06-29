package day21listsdt;

import java.util.Arrays;

public class MultiDimensionalArraysQuestions01 {

	public static void main(String[] args) {
		
		
		/*
		 1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
		 */
		
		int arr[][] = { {1,2,3}, {4,5,6} };
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				sum+=arr[i][k];
			}
			
		}
		
		System.out.println(sum);

	}

}
