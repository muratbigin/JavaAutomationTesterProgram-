package day21listsdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDimensionalArraysQuestions06 {

	public static void main(String[] args) {
		
		/*
		 6) Write a Java program to remove a specific element from an array.
		 
		 */
		
//		List<Integer> arr1 = new ArrayList<>();
//		
//		arr1.add(5);
//		arr1.add(6);
//		
//		System.out.println(arr1);
//		System.out.println(arr1.remove(0));
//		System.out.println(arr1);
		
		
//		int arr[] = {2,4,6,7,8};
//		int arr1[]=new int[arr.length-1];
//		int e = 7;
//		
//		for (int i=0, k=0; i<arr.length; i++) {
//			if(arr[i] == e) {
//				System.out.println("asasasasa "+arr[i]);
//				continue;
//			}
//			arr1[k]=arr[i];
//			k++;
//		}
//		System.out.println(Arrays.toString(arr1));
//		
//		//2.way 
//		
//		Integer arr4[] = {2,4,6,7,8};
//		List<Integer> l1 = new ArrayList<>();
//		
//		for (int i : arr4) {      //for (int i=0; i<arr.length; i++)
//			l1.add(i);
//		}
//		
//		System.out.println(l1);
//		l1.remove(0);
//		System.out.println(l1);

		Integer arr6[] = {2,4,6,7,8};
		String arr7[] = {"aa", "cc", "gg"};
		System.out.println(removeElement(arr6, 7));
	}
	public static <T> List<T> removeElement(T[] arr, T e) {
		List<T> l1 = new ArrayList<>();
		
		for (T i : arr) {
			l1.add(i);
		}
		l1.remove(e);
		return l1;
	} 

}
