package day15dowhileloopdt;

public class DoWhile02 {

	public static void main(String[] args) {
		// Print first 10 counting numbers on the console by using do-while loop
		
	
		int i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=10);
		
		//Print first 5 even counting numbers on the console by using do-while loop
		//1>way My solution
		int k =0;
		
		do {
			System.out.print(k + " " );
			k+=2;
		}while(k<=10);
		
		
		//2way
		int j =1;
		do {
			if(j%2==0) {
				System.out.print(j + " ");
			}
			j++;
		}while(j<=10);
		
		
		// Print the counting numbers which are divisible by 3 and less than 100
		// by using do-while loop
		int m =1;
		do {
			if(m % 3==0) {
				System.out.println(m + " ");
			}
			m++;
		}while(m<100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
