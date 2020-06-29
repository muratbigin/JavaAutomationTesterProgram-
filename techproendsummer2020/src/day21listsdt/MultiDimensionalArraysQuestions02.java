package day21listsdt;

public class MultiDimensionalArraysQuestions02 {
	
	

	public static void main(String[] args) {

		/*
		 * 2) Find the product of the last elements in the array elements of the given
		 * multi dimensional array { {1,2,3}, {4,5}, {6} }
		 */

		int pro[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };
		int product=1;
	
		for (int i=0; i<pro.length; i++) {
			int lastEl = pro[i].length-1;
			product*=pro[i][lastEl];
		//product*=	pro[i][pro[i].length-1];
				
			
		}
		System.out.println(product);
		
	}

}
