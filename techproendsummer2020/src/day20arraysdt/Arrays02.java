package day20arraysdt;

public class Arrays02 {

	public static void main(String[] args) {
		
		int arr1[] = {2, 7, 6};
		int arr2[] = {2, 7, 6};
		int arr3[] = {6, 2, 7};
		
		//1. Way: Using loops to check equality
		
		int count =0;
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]==arr2[i]) {
				count++;
			}
		}
		
		if(count==arr1.length) {
			System.out.println("Array are same");
			
		}else {
			System.out.println("Arrays are not same");
		}
		

	}

}
