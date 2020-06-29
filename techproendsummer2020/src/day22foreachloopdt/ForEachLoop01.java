package day22foreachloopdt;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		
		/*
		  1) For Each Loop works with collections (Arrays,Lists)
		  2) The other name of For Each Loop is "Enhanced Loop"
		  
		 */
		
		int arr[] = {1, 2, 3, 4, 5};
		
		for(int w : arr) {
			System.out.println(w + " ");
		}
		
		
		//find the sum of all elements of arr by using for-each loop
		
		int sum =0;
		
		for(int w : arr) {
			sum+=w;
		}
	
		System.out.println("sum= "+ sum);
		
		
		// Print the even elements on the console by using for=each loop
		
		
	int sum1 =0;
		
		for(int w : arr) {
			if (w%2==0) {
				
				sum1+=w;	
			}
		}
			System.out.println("sum1= "+ sum1);	
			
			
			// Print the even elements on the console by using for=each 
			//loop and continue	
			
			for(int w : arr) {
				if(w%2!=0) {
					continue;
				}
				System.out.print(w + " ");
				
			}
			
			
			//Find the multiplication of odd elements 
			//by using for-each loop and continue
			int product=1;
			for(int w : arr) {
				if(w%2==0) {
				continue;
				}
				product*=w;
				
				
			}
			System.out.println(product);
			
			//Find the sum off all elements except 3 by using 
			//for-each loop and continue
			
			int sum2=0;
			for(int w : arr) {
				if(w==3) {
					continue;
				}
				sum2+=w;
				
			}
			System.out.println(sum2);
			
			
			
		
		
}

}
