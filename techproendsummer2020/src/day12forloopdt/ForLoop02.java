package day12forloopdt;

public class ForLoop02 {

	public static void main(String[] args) {
		// Print your name 20 times on the console
		
		for(int i=1; i<=20; i++) {
			System.out.println("Murat");
		}
		 
		
		//Print the integer from 3 to 20 on the sane line with a space between them
		//3 4 5 ... 19 20
		
		for(int i=3; i<=20; i++) {
			System.out.println(i);
		}
		
		//Print the integer from 20 to 3 on the sane line with a space between them
		//20 19 18 ... 4 3
		
		for(int i=20; i>=3; i--) {
			System.out.println(i);
		
		}
		
		//Print the even integer from 12 to 32 on the sane line with a space between them
		//12 14 16 ...30 32
		
		for(int i=12; i<=32; i+=2) {
			System.out.println(i);
		
		}
		
		// sulayman's way 
		
		for(int i=12; i<=32; i++) {
			if(i%2==0) {
			System.out.print(i + " ");
			}
		}
		
		
		//Print the odd integers from 12 to 32 on the sane line with a space between them
		
		// 1.way by using if statement
		for(int i=12; i<=32; i++) {
			if(i%2==1) {
			System.out.print(i + " ");
			}
		}
		
		//2.way by changing increment part

		for(int i=13; i<=32; i+=2) {
			System.out.println(i);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
