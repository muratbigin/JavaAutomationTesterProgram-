package day12forloopdt;

public class ForLoop04 {

	public static void main(String[] args) {
		

		// find the product(multiplication) of first the 5 counting number and print the 
		// product on the console
		
		int product =1;
		for(int i=1; i<=5; i++) {
			
			product*=i;
			System.out.println(product);
			
		}
		
		System.out.println("outside: " + product);
		
		

	}

}
