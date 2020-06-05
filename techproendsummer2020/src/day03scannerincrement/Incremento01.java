package day03scannerincrement;

public class Incremento01 {

	public static void main(String[] args) {
//		increment: to increase the value of a variable
		
		int num1 = 10;
		System.out.println(num1);
		
//		1. way
		num1 = num1 + 5; 
		System.out.println(num1);
		
//		2. way
		num1+=10;
		System.out.println(num1);

		
//      3. way: this way is used for increasing by 1 
		num1++;
		System.out.println(num1);
		
		
	}

}
