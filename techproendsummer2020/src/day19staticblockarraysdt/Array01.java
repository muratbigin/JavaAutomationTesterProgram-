package day19staticblockarraysdt;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
	

		
		 // -How to create an Array
		
		int arr[] = new int[4];
		
		
		
		//-How to print array on the console
		System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0]
		
		//-How to assign a value for a specific element of an array
		arr[0]=11;
		System.out.println(Arrays.toString(arr)); //[11, 0, 0, 0]
		
		arr[3]=14;
		System.out.println(Arrays.toString(arr)); //[11, 0, 0, 14]
		
		arr[1]=12;
		System.out.println(Arrays.toString(arr)); // [11, 12, 0, 14]
		
		arr[2]=13;
		System.out.println(Arrays.toString(arr)); // [11, 12, 13, 14]
		
		
		//-How to get the number of elements in an array
		System.out.println(arr.length);// 4
		// In Strings when use length we need parentheses but in Array there is  no parentheses
		
		
		//-How to create an Array in short way
		int brr[] = {21, 22, 23, 24, 25, 26};
		System.out.println(Arrays.toString(brr)); //[21, 22, 23, 24]
		
		
		//What happens if you try to use non-existing index in an Array?
		//Answer: You do not get Compile Time Error
		//       You get Run Time Error ==> ArrayIndexOutOfBoundsException
		
		//brr[4] =25;  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		                         //at day19staticblockarraysdt.Array01.main(Array01.java:47)
		
		
		//-How to print a specific element on the console
		System.out.println(brr[1]);//22
		System.out.println(brr[0]);//21
		System.out.println(brr[2]);//23
		System.out.println(brr[3]);//24
		
		
		//-How to print all elements by using loop on the console
		// if you use some soecific numbers in your code it means you are hard coding 
		// it is not good.Try to make your code dynamic by using like brr.length
		
		for(int i=0; i<brr.length; i++) {
			System.out.println(brr[i] + " ");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 

	}

}
