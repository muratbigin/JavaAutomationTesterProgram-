package day19staticblockarraysdt;

import java.util.Arrays;

public class Array02 {
	
	
	
	
	


	public static void main(String[] args) {
		String arr[] = {"Angile","Leo","Brad","Adam","Jack"};
		System.out.println(Arrays.toString(arr)); //[Angile, Leo, Brad, Adam, Jack]
		//-How to sort elements in ascending order
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[Adam, Angile, Brad, Jack, Leo]
		
		//For number we use "ascending order", for Strings we use "alphabetical order"
		//"ascending order"  and  "alphabetical order" both are called "Natural Order"
		
		
		}

	}


