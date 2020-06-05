package day03scannerincrement;

public class Decrement01 {

	public static void main(String[] args) {
	 
		
//	   DEcrement: to decrease the value of a variable
		
//		1. Way 
		int num = 10;
		num = num - 3;
		System.out.println(num);//7
		
		
//		2. Way 
		num-=2;
		System.out.println(num);//5
		
//		3.Way 
		num--;
		System.out.println(num);//4
		
		
		int num1 =12;
		System.out.println(num1);

		
//		To increase we can use multiplication as well
//		1.Way
		num1=num1 * 2;
		System.out.println(num1);//24
		
//		2.way
		num1*=3;
		System.out.println(num1); //72
		
		
//		to decrease we can use division as well 
		
//		1.way
		
		num1=num1/6;
		System.out.println(num1);//12
		
//		2.way
		num1/=2;
		System.out.println(num1);//6
		
	}

}
